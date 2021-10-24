package Lesson1.HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
checkSumSign();
printColor();
        compareNumbers();

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public  static void checkSumSign(){
        int a = 398;
        int b = -789;
        int result = a+b;
        if (result >= 0 ){
            System.out.println("Сумма положительная");}
        else
            System.out.println("Сумма отрицательная");

    }
    public  static void printColor(){
        int value = 101;
        if ( value <= 0){
            System.out.println("Красный");
        }
        else if (0< value && value<=100){
            System.out.println("Жёлтый");
        }
        else
            System.out.println("Зелёный");
    }
    public  static void compareNumbers(){
        int a = 589;
        int b = 980;
        if (a >= b){
            System.out.println("a >= b");
        }
        else
            System.out.println("a < b");

    }
}
