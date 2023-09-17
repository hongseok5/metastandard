package com.hongseok.metastandard.web.dto;

import com.hongseok.metastandard.domain.posts.Posts;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // getter를 생성해줌
@RequiredArgsConstructor // final필드가 포함된 생성자를 생성해줌
public class PostsResponseDto {

    private String author;
    private  String title;
    private  String content;
    private Long id;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
