class Student{
     String name;
     int rollNumber;
     int marks;
        Student(String name, int rollNumber, int marks){
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }
        char GradeCalculate(int marks){
            if(marks>90){
                return 'A';
            }
            else if(marks>80){
                return 'B';
            }
            else if(marks>70){
                return 'C';
            }
            else if(marks>60){
                return 'D';
            }
            else if(marks>50){
                return 'E';
            }
            else if(marks>40){
                return 'F';
            }
            else{
                return 'G';
            }
        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("Roll Number: "+rollNumber);
            System.out.println("Marks: "+marks);
            System.out.println("Grade: "+GradeCalculate(marks));
        }
}

public class StudentPrograms {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 1, 95);
        s1.display();
        Student s2 = new Student("Rohit", 2, 85);
        s2.display();
    }
}