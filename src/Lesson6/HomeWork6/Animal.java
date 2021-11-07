package Lesson6.HomeWork6;

public abstract class Animal {
     String nameAnimal;
     int distance;
     int swim;
    public Animal(String nameAnimal,int distance){
        this.nameAnimal=nameAnimal;
        this.distance=distance;
        this.swim=swim;
    }
       public abstract void runAnimal();
       public abstract void swimAnimal();



}
