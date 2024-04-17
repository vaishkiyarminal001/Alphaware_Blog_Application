package com.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entities.Comment;
import com.blog.entities.MyUser;
import com.blog.entities.Post;
import com.blog.exceptions.CommentException;
import com.blog.repositories.CommentRepository;
import com.blog.repositories.PostRepository;
import com.blog.repositories.UserRepository;

@Service
public class CommentServiceImpl implements CommentService{

	
	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;
	
	
	@Override
	public Comment createComment(Integer userId, Integer postId, Comment comment) throws CommentException {
		MyUser myUser = userRepository.findById(userId)
				.orElseThrow(() -> new CommentException("User not found with ID: " + userId));

		Post post = postRepository.findById(postId)
				.orElseThrow(() -> new CommentException("Post not found with ID: " + postId));

		comment.setMyUser(myUser);
		comment.setPost(post);

		return commentRepository.save(comment);
	}

	@Override
	public Comment updateComment(Integer commentId, Comment comment) throws CommentException {
		Comment comm = commentRepository.findById(commentId)
				.orElseThrow(() -> new CommentException("Comment not found."));
		comm.setContent(comment.getContent());
		return commentRepository.save(comm);
	}

	@Override
	public Comment deleteComment(Integer commentId) throws CommentException {
		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new CommentException("Comment not found."));
		commentRepository.delete(comment);
		return comment;
	}

	@Override
	public List<Comment> getCommentsByPost(Integer postId) throws CommentException {
		postRepository.findById(postId).orElseThrow(() -> new CommentException("Post not found."));
		List<Comment> comments =  commentRepository.findByPostPostId(postId);
		if (comments.isEmpty()) throw new CommentException("No comment found in given Post");
		return comments;
		}

	@Override
	public List<Comment> getCommentsByUser(Integer userId) throws CommentException {
		userRepository.findById(userId).orElseThrow(() -> new CommentException("User not found."));
		List<Comment> comments =  commentRepository.findByPostPostId(userId);
		if (comments.isEmpty()) throw new CommentException("No comment found in given Post");
		return comments;
	}

}
