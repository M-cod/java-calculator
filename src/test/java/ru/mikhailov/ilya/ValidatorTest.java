package ru.mikhailov.ilya;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidatorTest {
    @ParameterizedTest
    @MethodSource("ru.mikhailov.ilya.Providers#testIsValidOperator")
    @DisplayName("Тест метода testIsValidOperator")
    void testIsValidOperator(String expression){
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Validator.isValid(expression));
        assertThat("Некорректный ввод выражения! Провертье правильность расположения операторов!", is(equalTo(exception.getMessage())));
    }

    @ParameterizedTest
    @MethodSource("ru.mikhailov.ilya.Providers#testIsValidBracket")
    @DisplayName("Тест метода testIsValidBracket")
    void testIsValidBracket(String expression) {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Validator.isValid(expression));
        assertThat("Некорректный ввод выражения! Проверьте правильность расположения скобок!", is(equalTo(exception.getMessage())));
    }

    @ParameterizedTest
    @MethodSource("ru.mikhailov.ilya.Providers#testIsValidEmpty")
    @DisplayName("Тест метода testIsValidEmpty")
    void testIsValidEmpty(String expression) {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Validator.isValid(expression));
        assertThat("Некорректный ввод выражения! Пустая строка!", is(equalTo(exception.getMessage())));
    }
}
