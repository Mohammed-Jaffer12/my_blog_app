package com.myblog2.service;

import com.myblog2.payload.CommentDto;

import java.util.List;


public interface CommentService {

    CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentsById(long postId, long commentId);

    List<CommentDto> getAllCommentsById();

    void deleteCommentById(long postId, long commentId);
}
