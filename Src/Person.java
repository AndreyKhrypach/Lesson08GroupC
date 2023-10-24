public class Person {
    // public
    //protected
    //default
    //private
    public String name;
    public int age;
    public String profession;
    public boolean sex;

    public Person(String name, int age, String profession, boolean sex) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", sex=" + (sex ? "male" : "female") +
                '}';
    }
}
