package com.blog.services;

import java.util.List;

import com.blog.dto.PostResponse;
import com.blog.entities.Post;
import com.blog.exceptions.PostException;

public interface PostService {
	
	Post createPost(Post post, Integer postId, Integer cateogoryId) throws PostException;
    Post updatePost(Post post, Integer postId) throws PostException;
    Post deletePost(Integer postId) throws PostException;
    Post getPostById(Integer postId) throws PostException;
    PostResponse getAllPosts(int pageNumber, int pageSize, String sortBy, String sortDir) throws PostException;
    List<Post> getPostByCategory(int categoryId) throws PostException;
    List<Post> getPostByUser(int userId) throws PostException;
   
    List<Post> searchPostByTitle(String keyWord) throws PostException;


}
