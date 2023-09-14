package ru.mikhailov.ilya;

import java.util.Scanner;

public class Console {
    public String write() {
        System.out.print("Введите строку: ");
        return new Scanner(System.in).nextLine();
    }

    public void readResult(Double characters) {
        System.out.println("Резльтат: " + characters);
    }
}
