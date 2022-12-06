package com.jinpring.app.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
												// Entity class, PK type
public interface UserRepo extends JpaRepository<UserEntity, Long>{
	// JpaRepository<T, ID>를 상속받은 인터페이스에는 기본적인 CRUD 메서드가 자동 생성된다.
}
