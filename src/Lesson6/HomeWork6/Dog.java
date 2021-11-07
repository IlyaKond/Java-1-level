package Lesson6.HomeWork6;

public class Dog extends Animal {
    int swim;
    String voiceDog;

    public Dog(String nameAnimal, int distance, int swim, String voiceDog) {
        super(nameAnimal, distance);
        this.voiceDog = voiceDog;
        this.swim = swim;
    }

    public void swimAnimal() {
        if (swim <= 10) {
            System.out.println(nameAnimal + " проплыл " + swim + " м");
        }
    }

    @Override
    public void runAnimal() {
        if (distance <= 500)
            System.out.println(nameAnimal + " пробежал " + distance + " м");

        else

    {
        System.out.println("Для пса " + nameAnimal + " слишком большая дистанция");
    }

}}

