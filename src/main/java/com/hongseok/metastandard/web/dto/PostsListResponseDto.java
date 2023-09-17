package com.hongseok.metastandard.web.dto;

import com.hongseok.metastandard.domain.posts.Posts;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter // getter를 생성해줌
public class PostsListResponseDto {

    private String author;
    private  String title;
    private Long id;

    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
