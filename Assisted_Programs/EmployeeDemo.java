package Assisted_Programs;
class  Employee{
    String name;
    String id;
    double salary;

    Employee(String name,String id,double salary){
       this.name=name;
       this.id=id;
       this.salary=salary;
    }
    
    void work(){
        System.out.println("Every employee has different works!");
    }

    void displayDetails(){
        System.out.println("Employee name is: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Salary: "+salary);
    }

}

class Manager extends Employee{
    int teamSize;
    Manager(int teamSize,String name,String id,double salary){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void work(){
        System.out.println(name+" Guides the team");
        System.out.println(name+"team size was "+teamSize);
        System.out.println();
    }
}

class Developer extends Employee{
    String programmingLanguage;
   
    Developer(String programmingLanguage,String name,String id,double salary){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    } 
   @Override
    void work(){
       System.out.println(name+" Develops Web Applications");
       System.out.println(name+"Works on "+programmingLanguage);
       System.out.println();
    }
}

class Intern extends Employee{
    int duration;
    Intern(int duration,String name,String id,double salary){
        super( name, id, salary);
        this.duration=duration;
    }

    void work(){
        System.out.println(name+" is intern here ");
        System.out.println("Unpaid Intern");
        System.out.println(name+" will for  "+duration+" months");
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager manager=new Manager(15, "Manish Patel", "LML2", 180000);
        Developer developer=new Developer("React", "Raj Chandanan", "Dt101", 80000);
        Intern intern=new Intern(3,"Arpita Gautam","IT101",0);

        manager.displayDetails();
        manager.work();
        developer.displayDetails();
        developer.work();
        intern.displayDetails();
        intern.work();
    }
}
