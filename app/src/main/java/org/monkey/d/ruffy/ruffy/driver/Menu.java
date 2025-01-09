package org.monkey.d.ruffy.ruffy.driver.display;

import java.util.List;

public class Menu {

    private String title;
    private List<String> options;

    // Конструктор
    public Menu(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    // Метод для получения заголовка меню
    public String getTitle() {
        return title;
    }

    // Метод для установки заголовка меню
    public void setTitle(String title) {
        this.title = title;
    }

    // Метод для получения опций меню
    public List<String> getOptions() {
        return options;
    }

    // Метод для установки опций меню
    public void setOptions(List<String> options) {
        this.options = options;
    }

    // Метод для отображения меню
    public void displayMenu() {
        System.out.println("Menu: " + title);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }
}