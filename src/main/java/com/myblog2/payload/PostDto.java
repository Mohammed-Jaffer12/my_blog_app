package com.myblog2.payload;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {


    private long id;

    @NotEmpty
    @Size(min =2,message = "Post title should be atleat 2 character")
    private String title;

    @NotEmpty
    @Size(min =4,message = "Post description should be atleat 4 character")
    private String description;

    @NotEmpty
    @Size(min =10,message = "Post content should be atleat 10 character")
    private String content;

}
