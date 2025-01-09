package org.monkey.d.ruffy.ruffy.driver;

public class Ruffy {

    private String name;

    // Конструктор
    public Ruffy(String name) {
        this.name = name;
    }

    // Метод для получения имени
    public String getName() {
        return name;
    }

    // Метод для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Пример метода
    public void performAction() {
        // Реализация метода
        System.out.println("Performing action...");
    }

    // Пример статического метода
    public static void staticMethod() {
        // Реализация статического метода
        System.out.println("Static method called...");
    }
}