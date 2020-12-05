package com.jojoldu.book.springboot.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    public final String name;
    private final int amount;
}
