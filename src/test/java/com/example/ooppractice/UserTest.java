package com.example.ooppractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
//        user.initPassword();  // 고정 password 를 넣어주지 않으면 테스트가 성공 및 실패를 번갈아가면서 진행한다. (generatePassword 가 0 ~ 12 자의 패스워드를 생성하므로 7자리 이하 비밀번호면 실패가 발생한다.)
        user.initPassword(() -> "abcdefgh");

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        user.initPassword(() -> "ab");    // 항상 2자리 password 이기 때문에 실패

        // then
        assertThat(user.getPassword()).isNull();
    }
}