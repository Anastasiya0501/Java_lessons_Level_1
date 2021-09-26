import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        //Задание 3
        Emploee emploee1 = new Emploee("Андрей", "Иванов", "Иванович", "специалист", "36066", "AIIvanov@rosnpsnsk.com", 54230.00, 27);
        System.out.println("ФИО, должность: " + emploee1.first_name + " " + emploee1.middle_name + " " + emploee1.last_name + ", " + emploee1.post);
        System.out.println("Контактная информация: " + emploee1.phone_number + ", " + emploee1.email);
        System.out.println("Персональные данные:" + "\n" + "1. Заработная плата - " + emploee1.salary + " руб." + "\n" + "2. Возраст - " + emploee1.age + " лет");
        */

        //Задание 4 и 5
        System.out.println("\n" + "Задание 4 и 5");
        Emploee[] Personal = new Emploee[5];
        Personal[0] = new Emploee("Иван", "Иванов", "Иывнович", "старший специалист", "89233658798", "ivanov@gmail.com", 44000.00, 44);
        Personal[1] = new Emploee("Борисов>", "Борис", "Борисович", "специалист", "89234571442", "borisov@gmail.com", 31500.00, 42);
        Personal[2] = new Emploee("Петров", "Петр", "Петрович", "старший инженер", "89326571232", "petrov@gmail.com", 43500.00, 39);
        Personal[3] = new Emploee("Максимов", "Максим", "Максимович", "инженер", "89326571232", "maksimov.gmail.com", 32000.00, 28);
        Personal[4] = new Emploee("Антонов", "Антон", "Антонович", "инженер", "89326571232", "antonov.gmail.com", 31000.00, 36);
        for (int i = 0; i < Personal.length; i++) {
            if ( Personal[i].getAge() > 40) {
                System.out.println(Personal[i]);
            }
        }

    }
}
