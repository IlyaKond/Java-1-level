package Lesson3.Online;

import java.util.Random;
import java.util.Scanner;

public class ArrayClass {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
      //  System.out.println("My password is [" + randomPassword(valueFromUser("Enter length password")) + "]");
        // for (int i = 0; i < 10; i++) {
        //  System.out.print(random.nextInt()+ " > "); / [int; int]
        //  System.out.print(random.nextFloat()+ " > "); //[0; 1)
        //   System.out.print(random.nextInt( 200)+ " > "); //[0;bound)
  // int[] arrayInt = new int[4];
  //      arrayInt[0]=127;
  //      arrayInt[1]=-4;
  //      arrayInt[2]=35;
  //      arrayInt[3]=2;
  //      System.out.println("ArrayInt value "+arrayInt[2]);
   //     String[] arrayStr = {"qwerty", "привет", "прощай"}; //new string
   //     System.out.println(arrayStr);

   // int[] testIntRandom = new int[30];

   //     for (int i = 0; i < testIntRandom.length; i++) {
    //        testIntRandom[i] =random.nextInt(50);
    //    }

    //    for (int i = 0; i < testIntRandom.length; i++) {
    //        System.out.print(testIntRandom[i]+" > ");
    //    }
    //    createArray(5, true);
     //   int[] test1 = new int[3];
     //   String[] test2 =new String[4];
     //   printArray(createArray(5, true));
     //   printArray(test1);

      //  int[][] myArray2 = new int[4][9];
      printArray2(10,10);

    }
    public static void printArray2( int length1Size, int length2Size ){
        String[][] array= new String[length1Size][length2Size];
        for (int y = 0; y < array.length ; y++) {
            for (int x = 0; x < array[y].length; x++) {
           array[y][x] = ("["+y+";"+x+"]");
            }
            System.out.println();
        }
        for (int y = 0; y < array.length ; y++) {
            for (int x = 0; x < array[y].length; x++) {
                System.out.print(array[y][x]+"\t");
            }
            System.out.println();
        }
        }

    public static int[] createArray(int length, boolean isFill){
        int[] tmp = new int[length];
        if(isFill){
            for (int i = 0; i < tmp.length; i++) {
              tmp[i]=random.nextInt(10);
            }
        }
        return tmp;
    }
    public static void printArray(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+ " > ");
        }
        System.out.println();
    }
    public static void printArray(String[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+ " > ");
        }
        System.out.println();
    }
    //  for (int i = 0; i < 10; i++) {
    //      System.out.print(myRandomValueInt(-5,6)+" > ");
    //  }
    //  String tmp = scanner.next();
    //  System.out.println("Hello,"+tmp+" !" );
    // System.out.println("Hello  " + welcomeUser( "Enter your name"));
    // System.out.println("Your number is  " + welcomeUser("Enter your phone"));
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    //     System.out.println("Result = " + (valueFromUser("Enter a")+ valueFromUser("Enter b")) );
    //  }
    //  public static String welcomeUser(String greetingMessage) {
    //      System.out.print(greetingMessage + " >");
    //      return scanner.next();
    //  }
    //  public static  int valueFromUser(String greetingMessage){
    //     System.out.print(greetingMessage + " > ");
    //      return scanner.nextInt();
    public static String randomPassword(int lengthPass) {
        String tmp = ""; //gsdgrt3trert3454etr
        for (int i = 0; i < lengthPass; i++) {

            int valueForChar = myRandomValueInt(50, 125);
            char tmpChar = (char) valueForChar;
            tmp += tmpChar;
        }


        return tmp;

    }
    public static int myRandomValueInt(int min, int max) {

        return min + random.nextInt(max - min + 1);
    }
    public static int valueFromUser(String greetingMessage) {
        System.out.print(greetingMessage + " > ");
        return scanner.nextInt();

        //  public static String welcomeUser(String greetingMessage) {
        //      System.out.print(greetingMessage + " >");
        //      return scanner.next();
        //  }
    }
}