public class Dog extends Animal{
    static int countAnimal;
    public Dog(String kindAnimal, int distanceRun, int distanceSwim) {
        super(kindAnimal, distanceRun, distanceSwim);
        countAnimal++;
    }
}
