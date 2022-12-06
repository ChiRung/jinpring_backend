package com.jinpring.app.domain.User;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EntityListeners(AuditingEntityListener.class) // 이 부분이 createDate, lastModifiedDate를 쓸 수 있게 해쥼. 그리고 main에도 선언해놨음. 이거 엔티티마다 쓰기 싫으면 따로 엔티티만들고 상속 받아와서 쓰면 도ㅑ
@Table(name = "user")
@Getter
@NoArgsConstructor
@Entity
public class UserEntity { // 이 entity class를 @Builder와 mapstruct의 @mapping을 사용하여 dto class 내부에 작성하도록 수정할 수 있을듯?

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(length = 45, nullable = false)
	private String userEmail;

	@Column(length = 45, nullable = false)
	private String userPassword;
	
	@Column(length = 16, nullable = false)
	private String userName;
	
	@CreatedDate
	private Date createDate;
	
	@LastModifiedDate
	private Date updateDate;

	@Builder
	public UserEntity(Long userId, String userName, String userEmail, String userPassword, Date createDate, Date updateDate) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
}
