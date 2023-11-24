package com.myblog2.service;

import com.myblog2.payload.PostDto;
import com.myblog2.payload.PostResponse;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    PostDto savePost(PostDto postDto);

    void deletePost(long id);

    PostDto updatePost(long id, PostDto postDto);

    PostDto getPostById(long id);

    PostResponse getPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
