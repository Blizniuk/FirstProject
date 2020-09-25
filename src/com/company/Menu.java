package com.company;

public class Menu {

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        System.out.println("Привет! Хочешь вкусную шаурму?" + "\n" + "У нас ты можешь:" + "\n");
        getMenu();
    }

    private static void getMenu() {
        System.out.println("- Заказать вкуснейшую шаурму");
        System.out.println("- Оформить доставку");
        System.out.println("- Оплатить заказ на сайте");
        System.out.println("- Заказать звонок");
    }
}
