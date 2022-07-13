package com.kay.optional;

import com.kay.dto.User;
import org.junit.Test;

import java.util.Optional;

public class testIfPresent {
    /**
     * 测试Optional类的ifPresent方法
     *
     * @see java.util.Optional#ifPresent(java.util.function.Consumer)
     */
    @Test
    public void testIfPresent() {

        // create one
        Optional<User> userOne = Optional.<User>ofNullable(new User());
        // 用LAMDA表达式实现Consumer接口
        userOne.ifPresent(e -> e.setEmail("yanghang@163.com"));
        // test
        System.out.println(userOne.get().getEmail());
    }

}
