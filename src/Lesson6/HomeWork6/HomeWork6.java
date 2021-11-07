package Lesson6.HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик",40,"Мур-мур");
        Dog dog1 = new Dog("Рекс", 501,7,"Ауф-ауф");
        Cat cat2 = new Cat("Люся",400,"Мяу-мяу");
        Dog dog2 = new Dog("Макс", 345,9,"Гав-Гав");
        Animal[] pets={cat1,dog1,cat2,dog2};
        for (int i = 0; i < pets.length; i++) {
            pets[i].runAnimal();
            pets[i].swimAnimal();
            }
        }

    }
