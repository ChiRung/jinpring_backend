package com.jinpring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jinpring.app.domain.User.UserEntity;
import com.jinpring.app.domain.User.UserRepo;
import com.jinpring.app.dto.signUp.SignUp_req_dto;

// @ResponseBody // 메스드들이 값을 return 할 때 JSON 타입으로 return한다.
// @Controller // View를 리턴한다.
@RestController // @ResponseBod + @Controller 느낌으로, View 대신 JSON을 return 한다.
public class Old_SignUpController {
	
//	@PostMapping("/signUpsignUp")
//	public void signUp(@RequestBody SignUpDto signUpDto) {
//		System.out.println(signUpDto.getUserName());
//		System.out.println(signUpDto.getPassword());
//		
//	}
//
//	@Autowired
//	SignUpRepo signUpRepo;
//
//	@GetMapping("/testtest")
//	public List<SignUpEntity> getTest() {
//
//		// SiUPEntity의 constructor인 builder를 실행하고,
//		// signUpRepo에 저장한다?
//		signUpRepo.save(SignUpEntity.builder()
//					.userName("사람이름")
//					.userPassword("하루에 네번 사랑을 말하고")
//					.userEmail("chirung2404@naver.com")
//					.build());
//
//		// when
//		// findAll()은 sql query 중 SELECT * FROM signUPRepo 와 같다.
//		List<SignUpEntity> signUpEntityList = signUpRepo.findAll();
//		System.out.println(signUpEntityList);
//		return signUpEntityList;
//	}
}
