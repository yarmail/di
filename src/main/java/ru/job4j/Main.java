package ru.job4j;

/**
 * Здесь попробобуем использовать наш
 * ручной DI
 *
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Name1");
        ui.add("Name2");
        ui.print();
        ui.askStr("Console input work");
    }
}
