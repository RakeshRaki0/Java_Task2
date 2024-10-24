public class Employee extends Person{
    double salary;
    int employeeId;

    public Employee(String name, int age, double salary,int employeeId){
        super.name = name;
        super.age = age;
        this.salary = salary;
        this.employeeId = employeeId;
    }
    public void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee EmployeeId: "+ employeeId);
    }

    public static void main(String[] args) {
        Employee em = new Employee("Rakesh",26,15000,855);
        em.display();
    }
}
