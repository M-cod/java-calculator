package ru.mikhailov.ilya;

public class Main {
    public static void main(String[] args){
        // write your code here
        Console console = new Console();
        Calculate calculate = new Calculate();

        String text = console.write();
        if (Validator.isValid(text)) {
            console.readResult(calculate.getAnswer(calculate.ReversePolishNotation(text)));
        }
    }
}
