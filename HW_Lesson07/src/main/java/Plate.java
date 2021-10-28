public class Plate {
    private int food;

    public void decreaseFood(int foodToEat) {
        if (food > foodToEat){
            food -= foodToEat;
        } else {
            System.out.println("В миске закончилась еда.");
        }
    }

    public void info() {
        System.out.println("Количество еды в тарелке: " + food);
    }

    public void addFoodToPlate(int addCatFood){
        food += addCatFood;
        }

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

}
