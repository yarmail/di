package ru.job4j;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("ru.job4j");
        /* Предыдущий вариант
        context.register(Store.class);
        context.register(ConsoleInput.class);
        context.register(StartUI.class);
        */
        context.refresh();

        StartUI ui = context.getBean(StartUI.class);
        ui.add("Name1");
        ui.add("Name2");
        ui.print();
        ui.askStr("Console input work");
    }
}
