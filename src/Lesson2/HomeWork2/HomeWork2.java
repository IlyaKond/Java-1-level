package Lesson2.HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println(within10and20(4,10));

        isPositiveOrNegative(-5);

        System.out.println(isNegative(-7));

        printWordNTimes("привет",8);

        System.out.println(days365orDays366(400));
    }
    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return  (sum >= 10 && sum <= 20);


    }



    public static void isPositiveOrNegative(int x){
        if (x>=0){
            System.out.println("Положительное");
        }
        else System.out.println("Отрицательное");
    }
    public static boolean isNegative(int x){

            return (x<0);
    }
    public static void printWordNTimes(String word, int times){
        for (int i=0; i < times; i++) {
        System.out.println(word);
        }
    }
    public static boolean days365orDays366(int year){

    return (year%4==0 && year%100 !=0 || year%400==0);

}
}
