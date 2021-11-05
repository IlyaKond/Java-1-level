package Lection04.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    //---Description Player
    public static char player = 'P';
    public static String namePlayer = "King Artur";
    public static int healthPlayer = 100;
    public static int strPlayer = 10;
    public static int xPosPlayer;
    public static int yPosPlayer;
public static char enemyInjured= 'X';
    public static final int moveUpPlayer = 8;
    public static final int moveLeftPlayer = 4;
    public static final int moveRightPlayer = 6;
    public static final int moveDownPlayer = 2;

    //---Description Location
    public static char[][] location;
    public static char[][] invisibleLocation;
    public static int locWidth;
    public static int locHeight;
    public static int locMin = 3;
    public static int locMax = 4;
    public static char emptyRoom = '_';
    public static char readyRoom = '+';
    public static boolean isRandomStartPointPlayer = false;

    //---Description Enemy
    public static char enemy = 'E';
    public static int healthEnemy;
    public static int strEnemy;
    public static int enemyValueMin = 10;
    public static int enemyValueMax = 15;
    public static int countEnemies;


    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            if (isALivePlayer()){
            System.out.println("Level = " +i);
             createLocation();
        createPlayer(isRandomStartPointPlayer);
        createEnemy();
        printLocation();

        while (true) {
            directionPlayer();
            printLocation();

            if (!isALivePlayer()) {
                System.out.println(namePlayer + " is dead!");
                break;
            }

            if (isReadyLocation()) {
                System.out.println(namePlayer + " win!");
                break;
            }
        }}


        } System.out.println("Good, bye! Game over!");
    }

    public static void createLocation() {
        locWidth = myRandomValueInt(locMin, locMax);
        locHeight = myRandomValueInt(locMin, locMax);
        location = new char[locHeight][locWidth];
        invisibleLocation =new char[locHeight][locWidth];
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWidth; x++) {
                location[y][x] = emptyRoom;
                invisibleLocation[y][x]=emptyRoom;
            }
        }
        System.out.println("New location created. Size " + locWidth + "x" + locHeight);
    }

    public static void createPlayer(boolean isRandom) {
        if (isRandom) {
            xPosPlayer = myRandomValueInt(0, locWidth - 1);
            yPosPlayer = myRandomValueInt(0, locHeight - 1);
        } else {
            xPosPlayer = 0;
            yPosPlayer = 0;
        }
        location[yPosPlayer][xPosPlayer] = player;
        invisibleLocation[yPosPlayer][xPosPlayer] = player;
        System.out.println(namePlayer + " has spawn in room [" + xPosPlayer + ":" + yPosPlayer + "]");

    }

    public static void createEnemy() {
        countEnemies = (locWidth + locHeight) / 2;
        healthEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);
        strEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);

        int xPosEnemy;
        int yPosEnemy;

        for (int i = 0; i < countEnemies; i++) {

            do {
                xPosEnemy = random.nextInt(locWidth); //[0; locWidth)
                yPosEnemy = random.nextInt(locHeight); //[0; locHeight)
            } while (!isEmptyRoom(xPosEnemy, yPosEnemy));

            invisibleLocation[yPosEnemy][xPosEnemy] = enemy;
        }
        System.out.println("Enemies has spawn. Count is " + countEnemies + ", HP=" + healthEnemy + ", STR=" + strEnemy);
    }

    public static void directionPlayer() {

        int currentX = xPosPlayer;
        int currentY = yPosPlayer;

        int playerMoveValue;

        do {
            System.out.print("Enter destination: (UP=" + moveUpPlayer + " | DOWN=" + moveDownPlayer +
                    " | LEFT=" + moveLeftPlayer + " | RIGHT=" + moveRightPlayer + ") >>> ");
            playerMoveValue = scanner.nextInt();

            switch (playerMoveValue) {
                case moveUpPlayer:
                    yPosPlayer -= 1;
                    break;
                case moveDownPlayer:
                    yPosPlayer += 1;
                    break;
                case moveLeftPlayer:
                    xPosPlayer -= 1;
                    break;
                case moveRightPlayer:
                    xPosPlayer += 1;
                    break;
            }

        } while (!isValidMovePlayer(currentX, currentY, xPosPlayer, yPosPlayer));

        playerNextMoveAction(currentX, currentY, xPosPlayer, yPosPlayer);

    }

    public static void playerNextMoveAction(int lastX, int lastY, int nextX, int nextY) {
       if (invisibleLocation[nextY][nextX] == enemy ) {
                healthPlayer -= strEnemy;
                countEnemies--;
                System.out.println("Warning! Enemy give damage to " + namePlayer + " is " + strEnemy + ". " + namePlayer + " health is " + healthPlayer);
                System.out.println("Count enemies is " + countEnemies);

        }

        location[lastY][lastX] = readyRoom;
        invisibleLocation[lastY][lastX] = readyRoom;
        location[nextY][nextX] = player;
        invisibleLocation[nextY][nextX] = player;

    }

    public static boolean isValidMovePlayer(int currentX, int  currentY, int nextX, int nextY) {
        if (nextX >= 0 && nextX < locWidth && nextY >= 0 && nextY < locHeight) {
            System.out.println(namePlayer + " move to [" + nextX + ":" + nextY + "]");
            return true;
        } else {
            System.out.println("Invalid move! Try again!");
            xPosPlayer = currentX;
            yPosPlayer = currentY;
            return false;
        }
    }

    public static boolean isEmptyRoom(int x, int y) {
        return invisibleLocation[y][x] == emptyRoom;
    }

    public static void printLocation() {
        System.out.println("=====> LOCATION <=====");
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWidth; x++) {
                System.out.print(location[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("======================");
    }

    public static int myRandomValueInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isALivePlayer() {
        return healthPlayer > 0;
    }

    public static boolean isReadyLocation() {
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWidth; x++) {
                if (location[y][x] == emptyRoom) {
                    return false;
                }
            }
        }
        return true;
    }


}
