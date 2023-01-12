public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1.2");

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 12.0;
        var cat = 7.6;
        var paper = 763793;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Значение переменной friend = " + friend);
        friend = friend + 2;
        System.out.println("Значение переменной friend = " + friend);
        friend = friend / 7;
        System.out.println("Значение переменной friend = " + friend);

    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Значение переменной frog = " + frog);
        frog = frog * 10;
        System.out.println("Значение переменной frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Значение переменной frog = " + frog);
        frog = frog + 4;
        System.out.println("Значение переменной frog = " + frog);

    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var sumWeight = weightFirstBoxer + weightSecondBoxer;
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Общий вес двух боксеров = " + sumWeight + " кг");
        System.out.println("Разница в весе двух боксеров = " + differenceWeight + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        var diffWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе двух боксеров = " + differenceWeight + " кг");
        System.out.println("Разница в весе двух боксеров = " + diffWeight + " кг");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var amountHours = 640;
        var workHours = 8;
        var amountEmployees = amountHours / workHours;
        System.out.println("Всего работников в компании — " + amountEmployees + " человек");
        amountEmployees = amountEmployees + 94;
        amountHours = amountEmployees * workHours;
        System.out.println("Если в компании работает " + amountEmployees + " человека, то всего " + amountHours + " часов работы может быть поделено между сотрудниками");

    }
}