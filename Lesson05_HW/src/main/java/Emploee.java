public class Emploee {
    private String first_name;
    private String last_name;
    private String middle_name;
    private String post;
    private String email;
    private String phone_number;
    private double salary;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Emploee(String first_name, String last_name, String middle_name, String post, String phone_number, String email, double salary, int age){
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.post = post;
        this. email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

}



