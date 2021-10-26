import java.util.Scanner;

public class Main {
    static int countAnimal = 0;

    public static void main(String[] args) {

        Cat cat = new Cat("Кошка", 200, 0);
        countAnimal++;
        Dog dog = new Dog("Собака", 150, 10);
        countAnimal++;

        System.out.println("Задание 2.");
        cat.running();
        cat.swimming();

        dog.running();
        dog.swimming();

        System.out.println();
        dog.distanceInfoRun();

        System.out.println("\n" + "Задание 3.");
        Scanner sc = new Scanner(System.in);
        dog.setDistanceRun(500);
        System.out.println("Кошка может пробежать: " + cat.getDistanceRun() + " м." + "\n" + "Собака может пробежать: " + dog.getDistanceRun() + " м.");

        System.out.println("Введите длину препятствия для кошки и собаки, в метрах: ");
        int distanceFromUser1 = sc.nextInt();
        if (distanceFromUser1 > cat.getDistanceRun()){
            System.out.println("Кошка не сможет пробежать такую дистанцию :(");
        } else {
            System.out.println(cat.getKindAnimal() + " пробежала: " + distanceFromUser1 + " м.");
        }
        if (distanceFromUser1 > dog.getDistanceRun()){
            System.out.println("Собака не сможет пробежать такую дистанцию :(");
        } else {
            System.out.println(dog.getKindAnimal() + " пробежала: " + distanceFromUser1 + " м.");
        }

        System.out.println("\n" + "Кошка может проплыть: " + cat.getDistanceSwim() + " м." + "\n" + "Собака может проплыть: " + dog.getDistanceSwim() + " м.");

        System.out.println("Введите длину препятствия **в воде** для кошки и собаки, в метрах: ");
        int distanceFromUser2 = sc.nextInt();
        if (distanceFromUser2 == cat.getDistanceSwim() || distanceFromUser2 != cat.getDistanceSwim())
            System.out.println("Кошки не умеет плавать!");

        if (distanceFromUser2 > dog.getDistanceSwim()){
            System.out.println("Собака не сможет проплыть такую дистанцию.");
        } else {
            System.out.println(dog.getKindAnimal() + " проплыла: " + distanceFromUser2 + " м.");
        }

       System.out.println("\n" + "Задание 4 со *");
            System.out.println("Общее количество кошек: " + Cat.countAnimal);
            System.out.println("Общее количество собак: " + Dog.countAnimal);
            System.out.println("Общее количество животных: " + (Cat.countAnimal + Dog.countAnimal));
            //Или другим способом:
            System.out.println("Общее количество животных: "  + countAnimal);
    }
}
