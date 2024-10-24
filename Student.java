public class Student {
    private int age;
    private String name;

    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }
    public Student(String name){
        this.name=name;
        this.age=18;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {

        Student s =new Student("Rakesh",25);
        Student s2 =  new Student("raki");
        s.display();
        s2.display();
    }
}
