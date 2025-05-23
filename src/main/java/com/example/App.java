package com.example;

public class App {
    public static void main(String[] args) {
        int newUnusedVar1=100;
        int newUnusedVar2=100;
    }
    // Sample code issue: method not used
    private static void unusedMethod() {
        System.out.println("This method is never used");
    }
}
