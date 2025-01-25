package Assisted_Programs;

class Animal{
String name;
int age;

void setDetail(String name, int age){
   this.name=name;
   this.age=age;
}

 void makeSound(){
    System.out.println("Animal makes a sound ");

    
 }
 void getDetail(){
    System.out.println("Animal name is :"+ name);
    System.out.println("Animal age is :"+age);
    // System.out.println();
 }

}
class Dog extends Animal{
    @Override
  void makeSound()
  {
    System.out.println("Dog barks");
        System.out.println();
    
   
  }
  }

class Cat extends Animal{
    @Override
    void makeSound()
    {
      System.out.println("MEWWWOO");
      System.out.println();
  
    }

}
class Bird extends Animal{
    @Override
    void makeSound()
    {
      System.out.println("Cirrrrriiiippping");
      System.out.println();
 
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog animal= new Dog();
        animal.setDetail("Janwar", 12);
        animal.getDetail();
        animal.makeSound();

        Dog dog= new Dog();
       dog.setDetail("Kutta", 2);
       dog.getDetail();
        dog.makeSound();

       Cat cat= new Cat();
       cat.setDetail("Billi", 1);
       cat.getDetail();
        cat.makeSound();


       Bird bird= new Bird();
        bird.setDetail("CHIDIYA", 2);
        bird.getDetail();
        bird.makeSound();

    }
}
