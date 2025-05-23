package com.example;

public class App {
    public static void main(String[] args) {
        int unusedVar=10;
        int unusedVar1=100;
        int NewUnusedVar1=100;
        int NewUnusedVar2=100;
                
        System.out.println("Hello, SonarQube!");
    }
    // Sample code issue: method not used
    private static void unusedMethod() {
        System.out.println("This method is never used");
    }
}
