package ru.mikhailov.ilya;


import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;


public class Providers {

    public static Stream<Arguments> testArithmeticOperationSum(){
        return Stream.of(
                Arguments.arguments("5+2",7),
                Arguments.arguments("5+3+2",10)

        );
    }
    public static Stream<Arguments> testArithmeticOperationMinus(){
        return Stream.of(
                Arguments.arguments("10-9",1),
                Arguments.arguments("10-1-2",7)

        );
    }

    public static Stream<Arguments> testArithmeticOperationMultiplications(){
        return Stream.of(
                Arguments.arguments("2*2",4),
                Arguments.arguments("2*2*5",20)

        );
    }

    public static Stream<Arguments> testArithmeticOperationDivision(){
        return Stream.of(
                Arguments.arguments("10/2",5),
                Arguments.arguments("100/4/5",5)

        );
    }

    public static Stream<Arguments> testArithmeticOperationDivisionByZero(){

        return Stream.of(
                Arguments.arguments("10/0"),
                Arguments.arguments("5/(1-1)")

        );
    }

    public static Stream<Arguments> testIsValidOperator() {
        return Stream.of(
                Arguments.arguments("2++3"),
                Arguments.arguments("2+3+"),
                Arguments.arguments("2--")

        );

    }
    public static Stream<Arguments> testIsValidBracket() {
        return Stream.of(
                Arguments.arguments("(1+2))"),
                Arguments.arguments("(1+1)+((2+2)")

        );

    }

    public static Stream<Arguments> testIsValidEmpty() {
        return Stream.of(
                Arguments.arguments("")

        );

    }
}
