public class JavaObject extends Object{

    public static void main(String[] args){
        StudentObject alice = new StudentObject("Alice", 3);
        System.out.println(alice);
        PrimarySchoolStudent amelia = new PrimarySchoolStudent("Amelia", 1, "Michael");
        System.out.println(amelia);
    }
}

class StudentObject {
    private String name;
    private int age;

    StudentObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "StudentObject{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends StudentObject{
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid " + super.toString();
        }
}
