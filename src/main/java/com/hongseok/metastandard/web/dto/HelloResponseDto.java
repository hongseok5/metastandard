package com.hongseok.metastandard.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // getter를 생성해줌
@RequiredArgsConstructor // final필드가 포함된 생성자를 생성해줌
public class HelloResponseDto {


    private final String name;
    private final int amount;
    //private Long id;

}
