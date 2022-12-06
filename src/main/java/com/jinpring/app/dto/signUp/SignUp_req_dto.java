package com.jinpring.app.dto.signUp;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.jinpring.app.domain.User.UserEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
//import lombok.RequiredArgsConstructor;

@JsonAutoDetect // 아마 JSON을 입력 받으면 자동으로 해석하는?
@Getter // 모든 변수(field)에 자동으로 getter를 생성해준다.
//@RequiredArgsConstructor // final이 명시된 변수가 포함된 constructor를 자동으로 생성해준다.
public class SignUp_req_dto { // dto 파일 내에서 엔티티로 변환한다?

	private String userName;
	private String userEmail;
	private String userPassword;
	
	@Builder
	public SignUp_req_dto(Long userId, String userEmail, String userPassword, String userName, Date createDate, Date updateDate) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	
	// toEntity라는게 딴게 아니라 결국 이 dto 클래스로 받아온 request 데이터를 entity class의 인스턴스? 아니면 필요한 것만 넣은 엔티티?로 리턴시킨다.
	public UserEntity toEntity() {
		return UserEntity.builder()
			.userName(userName)
			.userEmail(userEmail)
			.userPassword(userPassword)
			.build();
	}
}
