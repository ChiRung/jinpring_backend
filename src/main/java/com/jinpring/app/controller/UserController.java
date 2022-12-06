package com.jinpring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jinpring.app.domain.User.UserEntity;
import com.jinpring.app.domain.User.UserRepo;
import com.jinpring.app.dto.signUp.SignUp_req_dto;

//@ResponseBody // 메스드들이 값을 return 할 때 JSON 타입으로 return한다.
//@Controller // View를 리턴한다.
@RestController // @ResponseBod + @Controller 느낌으로, View 대신 JSON을 return 한다.
public class UserController {

	// autowired로 UserRepo 인스턴스를 생성한다.
	// UserRepo 인스턴스를 아래의 메서드에서 접근하여 showAll 같은 api를 호출한다.
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/user") // entity로 리턴하지 말고, dto로 리턴?
	public List<UserEntity> getAllUser() {
		List<UserEntity> userRepoList = userRepo.findAll(); //UsersEntity가 왜 나올까? userRepo는 DB와 연결되는 레포지토리(저장소 바로가기 정도?)이고, UserEntity가 데이터가 들어가는 테이블을 나타내는 클래스이기 때문
		return userRepoList; // 쉽게 유저의 배열(리스트)를 리턴해주니 리턴 타입을 List<>로 정했다고 생각하기
	}
	
	
	@GetMapping("/user/{id}")
	public void getUser(@PathVariable Long id) {
		UserEntity user = userRepo.getReferenceById(id);
	}
	
	@PostMapping("/signUp")
	public Long signUp(@RequestBody SignUp_req_dto signUp_req_dto) { // 일단 받는다. 고럼 엔티티로 변환
		return userRepo.save(signUp_req_dto.toEntity()).getUserId(); // getUserId는 UserEntity에 명시한 @Getter이다. 고럼 이 getter는 비어있는 Entity에서 데이터를 가져오진 않을테니 userRepo에서 가져오겠지???
		// 엔티티란 뭐랄까...db의 가면? 같은 느낌이랄까?
	}
	
	
}
