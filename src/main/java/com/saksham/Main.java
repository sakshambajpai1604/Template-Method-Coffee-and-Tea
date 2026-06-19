package com.saksham;

public class Main {

    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("Preparing Coffee:");
        coffee.prepare();

        System.out.println();

        System.out.println("Preparing Tea:");
        tea.prepare();
    }
}