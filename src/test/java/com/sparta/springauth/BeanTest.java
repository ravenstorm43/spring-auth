package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
    @Autowired
    @Qualifier("pizza")
    Food food;
    @Autowired
    Food chicken; // 같은 타입의 bean객체가 두개 이상일때 autowire하는법
    @Autowired
    Food pizza; // 첫째: 등록된 bean이름 명시

    @Test
    @DisplayName("테스트")
    void test1() {
//        pizza.eat();
//        chicken.eat();
        food.eat();
    }
}
