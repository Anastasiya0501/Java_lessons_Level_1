public class Main {
    public static void main(String[] args) {
        /*
    1.V	Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
        (например, в миске 10 еды, а кот пытается покушать 15-20).
    2.V	Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
        Если коту удалось покушать (хватило еды), сытость = true.
    3.V	Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
        то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    4.V	Создать массив котов и тарелку с едой, попросить всех котов покушать из этой
        тарелки и потом вывести информацию о сытости котов в консоль.
    5.V	Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
         */

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Зефир", 16, false);
        cats[1] = new Cat("Пломбир", 15, false);
        cats[2] = new Cat("Фисташка", 17, false);
        cats[3] = new Cat("Рожок", 23, false);
        cats[4] = new Cat("Булочка", 35, false);

        /*Cat cat1 = new Cat("Зефир", 16, false);
        Cat cat2 = new Cat("Пломбир", 15, false);
        Cat cat3 = new Cat("Фисташка", 17, false);
        Cat cat4 = new Cat("Рожок", 23, false);
        Cat cat5 = new Cat("Булочка", 35, false);*/

        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < cats.length; i++){
            if (cats[i].getIsNotHungry() == false && plate.getFood() >= cats[i].getAppetite()){
                cats[i].eat(plate);
                System.out.println("Котик " + cats[i].getName() + " покушал");
                cats[i].setIsNotHugry(true);
            } else if(cats[i].getIsNotHungry() == false && plate.getFood() < cats[i].getAppetite()) {
                plate.decreaseFood(plate.getFood());
                System.out.println("Котику " + cats[i].getName() + " не хватило еды :( ");
            } else {
                System.out.println("Котик " + cats[i].getName() + " не голоден!");
            }
        }
        System.out.println();
        plate.info();
        System.out.println();


        for (int i = 0; i < cats.length; i++){
            if (cats[i].getIsNotHungry() == true){
                System.out.println("Котик " + cats[i].getName() + " сыт");
            } else {
                System.out.println("Котик " + cats[i].getName() + " голоден");
            }
        }

        System.out.println();
        plate.addFoodToPlate(100);
        plate.info();

        for (int i = 0; i < cats.length; i++){
            if (cats[i].getIsNotHungry() == false) {
                cats[i].eat(plate);
                System.out.println("Котик " + cats[i].getName() + " покушал");
                cats[i].setIsNotHugry(true);
            }
        }
    }
}
