public class Cat {
    private String name;
    private int appetite;
    private boolean isNotHungry;

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public Cat(String name, int appetite, boolean isNotHungry) {
        this.name = name;
        this.appetite = appetite;
        this.isNotHungry= isNotHungry;
    }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void setIsNotHugry(boolean isNotHungry) {
        this.isNotHungry = isNotHungry;
    }
    public boolean getIsNotHungry() {
        return isNotHungry;
    }


}
