package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Test {


    public static void main(String[] args) {

        Application ap = new Application();
        Map<String, String> loginAndPassword1 = new TreeMap<>();
        loginAndPassword1.put("Roman111", "Roman12345");
        loginAndPassword1.put("@ivanov1977", "Ivanov!");
        loginAndPassword1.put("Petrov@11", "12345petrov");
        ap.setLoginAndPassword(loginAndPassword1);

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = sc.nextLine();

        System.out.println("Введите пароль");
        String password = sc.nextLine();

        ap.check(login,password);
    }
}
