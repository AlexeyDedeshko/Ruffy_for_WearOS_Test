package org.monkey.d.ruffy.ruffy.driver.display;

public class MenuAttribute {

    private String attributeName;
    private String attributeValue;

    // Конструктор
    public MenuAttribute(String attributeName, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    // Метод для получения имени атрибута
    public String getAttributeName() {
        return attributeName;
    }

    // Метод для установки имени атрибута
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    // Метод для получения значения атрибута
    public String getAttributeValue() {
        return attributeValue;
    }

    // Метод для установки значения атрибута
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    // Переопределение метода toString для удобного отображения атрибута
    @Override
    public String toString() {
        return "MenuAttribute{" +
                "attributeName='" + attributeName + '\'' +
                ", attributeValue='" + attributeValue + '\'' +
                '}';
    }
}