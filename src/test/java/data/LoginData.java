package data;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class LoginData {
    public static Stream<Arguments> loginData() {
        return Stream.of(
                Arguments.of("something@new.com", "dsd12343123"),
                Arguments.of("test@domain.com", "pass123213123123"),
                Arguments.of("user@mail.com", "qwerty12312312")
        );
    }
}
