import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
        // 1
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }   else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("**************");

        // 2
        int clientDeviceYear = 2011;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }   else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }   else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("**************");

        // 3

        int year = 1997;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("**************");

        // 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + 1);
        }   else if (deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + 2);
        }   else if (deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + 3);
        }
        System.out.println("**************");

        // 5
        int monthNumber = 12;
        if (monthNumber <= 12 && monthNumber > 0) {
            switch (monthNumber) {
                case 1:
                    System.out.println("winter");
                    break;
                case 2:
                    System.out.println("winter");
                    break;
                case 3:
                    System.out.println("spring");
                    break;
                case 4:
                    System.out.println("spring");
                    break;
                case 5:
                    System.out.println("spring");
                    break;
                case 6:
                    System.out.println("summer");
                    break;
                case 7:
                    System.out.println("summer");
                    break;
                case 8:
                    System.out.println("summer");
                    break;
                case 9:
                    System.out.println("autumn");
                    break;
                case 10:
                    System.out.println("autumn");
                    break;
                case 11:
                    System.out.println("autumn");
                    break;
                case 12:
                    System.out.println("winter");
                    break;
            }
        }

    }
}