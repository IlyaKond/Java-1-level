package Lesson6.HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("Барсик", 200, 1);
        Cat cat2 = new Cat("Мурзик", 300, 2);
        Dog dog1 = new Dog("Тузик", 500, 10);
        Dog dog2 = new Dog("Бобик", 350, 5);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        float runLength = 250;
        float swimLength = 8;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = "пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплыть на " + animals[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("All animals = " + Animal.countAnimal + " > cat count = " + Cat.countCat + " > dog count = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);

    }

    }
