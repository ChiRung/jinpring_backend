package com.jinpring.app.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 모든 변수(field)에 자동으로  getter를 생성해준다.
@RequiredArgsConstructor // final이 명시된 변수가 포함된 constructor를 자동으로 생성해준다.
public class UserResponseDto {
	private final String name;
	private final int amount;
	
}
