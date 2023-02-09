package OOPs;

class  Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age,Person obj) {
        obj.age = age; // equal to this.age  = age
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(45,obj);
        System.out.println(obj.getAge());
    }
}
