class Student{
    private int id;
    private String name;
    private int age;
    private String address;

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

public class Encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Saman", 20, "1575 New City, Maharagama");
        Student s2 = new Student(1, "Kamal", 24, "1575 New City, Pannipitiya");
        
        s2.setAddress("Stanmore Cresent,Colombo 07");
        
        System.out.println(s1.getName()+" : "+s1.getAddress());
        System.out.println(s2.getName()+" : "+s2.getAddress());
    }
    
}