package com.company;

public class StudentFoundException extends Exception {
    public StudentFoundException(String name) {
        super("Студент с ФИО "+ name + " не найден!");
    }
}