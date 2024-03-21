package com.jsp.chap04.service;

// 등록, 목록, 삭제 서비스 객체의 메서드 이름을 통일시키고,
// 객체 생성 시 다형성을 활용하여 하나의 타입으로 규격화 하여
// 상황에 맞게 객체를 갈아끼울 용도로 활용할 인터페이스 생성.

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IDancerService {

    // 모든 서비스 객체들은 execute() 메서드 이름으로 움직일 것이고,
    // 컨트롤러로부터 request 와 response 객체를 전달 받아서 잡무를 처리할 것이다.
    void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;


}
