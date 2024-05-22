package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 둘째: @Primary사용하기, 같은 타입의 Bean이 여러개여도 Primary가 설정된 Bean을 우선적으로 등록한다.
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}