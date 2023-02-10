public class Main {
    public static void main(String[] args) {

        task1_3();
        task4();
        task5();
    }
    public static void task1_3() {
        int clientOS = 1;// if true=Android, false=ios
        int year = 2016;
        switch (clientOS) {
            case 1:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            case 0:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
        }
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("Год высокосный");
            } else if (year % 100 == 0) {
                System.out.println("Год не высокосный");
            } else {
                System.out.println("Год высокосный");
            }
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        int monthNumber = 16;
        if (monthNumber < 13 && monthNumber >= 1) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь-Зима");
                    break;
                case 2:
                    System.out.println("Февраль-Зима");
                    break;
                case 3:
                    System.out.println("Март-Весна");
                    break;
                case 4:
                    System.out.println("Апрель-Весна");
                    break;
                case 5:
                    System.out.println("Май-Весна");
                    break;
                case 6:
                    System.out.println("Июнь-Лето");
                    break;
                case 7:
                    System.out.println("Июль-Лето");
                    break;
                case 8:
                    System.out.println("Август-Лето");
                    break;
                case 9:
                    System.out.println("Сентябрь-Осень");
                    break;
                case 10:
                    System.out.println("Октябрь-Осень");
                    break;
                case 11:
                    System.out.println("Ноябрь-Осень");
                    break;
                case 12:
                    System.out.println("Декабрь-Зима");
                    break;
            }
        }
    }
}