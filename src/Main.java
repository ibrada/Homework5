public class Main {
    public static void main(String[] args) {

// Task 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android");
        } else {
            System.out.println("Выберете версию вручную");
        }

// Task 2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        }

// Task 3
        int year = 2000;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
// Task 4
        int deliveryDistance = 59;
        int deliveryDay = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance < 20) {
                System.out.println("Потребуется " + deliveryDay + " день");
            }
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуется " + (deliveryDay + 1) + " дня");
            }
            if (deliveryDistance > 60) {
                System.out.println("Потребуется " + (deliveryDay + 2) + " дня");
            }
        }

// Task 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println(monthNumber + "й месяц принадлежит зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "й месяц принадлежит весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "й месяц принадлежит летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "й месяц принадлежит осеннему сезону");
                break;
            case 12:
                System.out.println(monthNumber + "й месяц принадлежит зимнему сезону");
                break;
            default:
                System.out.println("ERROR :D");
        }
    }
}