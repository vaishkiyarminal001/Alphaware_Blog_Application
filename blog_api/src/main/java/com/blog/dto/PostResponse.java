package com.blog.dto;

import java.util.List;

import com.blog.entities.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private List<Post> content;
    private int pageSize;
    private int pageNumber;
    private long totalElememt;
    private int totalPage;
    private boolean lastPage;
    
}
