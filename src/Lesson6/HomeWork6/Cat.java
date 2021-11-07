package Lesson6.HomeWork6;

public class Cat extends Animal{
    String voiceCat;
    public Cat(String nameAnimal,int distance,String voiceCat){
        super(nameAnimal,distance);
        this.voiceCat=voiceCat;
    }
    @Override
    public void swimAnimal(){

            System.out.println(nameAnimal+" не умеет плавать!");

    }
    @Override
            public void runAnimal(){
        if (distance<=200)
            System.out.println(nameAnimal + " пробежал " + distance + " м");
        else {
            System.out.println("Для кота "+nameAnimal+" слишком большая дистанция");
        }
    }

}
