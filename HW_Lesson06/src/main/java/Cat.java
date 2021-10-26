public class Cat extends Animal{
    static int countAnimal;

    public Cat(String kindAnimal, int distanceRun, int distanceSwim) {
        super(kindAnimal, distanceRun, distanceSwim);
        countAnimal++;
    }
}
