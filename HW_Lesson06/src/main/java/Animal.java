public class Animal {
    private String kindAnimal;
    private int distanceRun;
    private int distanceSwim;

    public Animal(String kindAnimal, int distanceRun, int distanceSwim) {
        this.kindAnimal = kindAnimal;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
    }

    public String getKindAnimal() {
        return kindAnimal;
    }

    public void setKindAnimal(String kindAnimal) {
        this.kindAnimal = kindAnimal;
    }

    public void running(){
        System.out.println(kindAnimal + " бегает");
    }

    public void swimming(){
        System.out.println(kindAnimal + " плавает");
    }

    public void distanceInfoRun(){
        System.out.println(kindAnimal + " пробежала " + distanceRun + " м.");
    }

    public void distanceInfoSwim(){
        System.out.println(kindAnimal + " пробежала " + distanceSwim + " м.");
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }
}
