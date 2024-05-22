package com.sparta.springauth.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pizza") // 셋째: @Qualifier사용하기, @Qualifier("pizza")에 등록한 이름이 같은 bean객체를 주입한다.
public class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}