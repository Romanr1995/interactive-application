package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Application {
    private String body;
    private String title;
    private Map<String, String> loginAndPassword = new TreeMap<>();

    public void setLoginAndPassword(Map<String, String> loginAndPassword) {
        this.loginAndPassword = loginAndPassword;
    }

    public Map<String, String> getLoginAndPassword() {
        return loginAndPassword;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addRecord() {
        System.out.println("Введите назнавание");
        Scanner s = new Scanner(System.in);
        setTitle(s.nextLine());
        System.out.println("Введите содержание");
        setBody(s.nextLine());
        System.out.println("Запись успешно добавлена");
    }

    public void check(String login, String psw) {
        Scanner scanner = new Scanner(System.in);
        OUTER:
        for (int i = 0; ; i++) {
            INNER:
            for (Map.Entry<String, String> e : getLoginAndPassword().entrySet()) {
                String key = e.getKey();
                String value = e.getValue();

                if (login.equals(key) && psw.equals(value)) {
                    System.out.println("Выберите действие:  \n 1)Добавить запись;");
                    int action = scanner.nextInt();
                    switch (action) {
                        case 1:
                            addRecord();
                            break;
                    }
                }
                break OUTER;
            }
            System.out.println("Неверный логин или пароль");
            System.out.println("Введите логин");
            login = scanner.nextLine();
            System.out.println("Введите пароль");
            psw = scanner.nextLine();
            check(login, psw);
        }
    }
}
