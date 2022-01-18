package com.example.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//스프링이 com.example.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것은 아니지만
			//특정 어노테이션이 붙어 있는 클래스 파일들을 new해서(ioc) 스프링 컨테이너에 관리해 줍니다.
public class BlogControllerTest {

	@GetMapping("/test/hello")	// 로그인창이 뜨면 아이디는 user, 비밀번호는 콘솔에 찾아서 복사해서 붙여넣기
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
