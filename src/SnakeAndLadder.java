import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder Program");
        int positionOne = 0;
        int positionTwo = 0;
        int count = 0;

        while (positionOne < 100 && positionTwo < 100) {
            count = count + 1;
            Random value = new Random();
            int dice = value.nextInt(6) + 1;
            int choice = value.nextInt(2);

            if (choice == 0) {
                // player 1
                int choose = value.nextInt(3);
                System.out.println("dice pointing for player 1 : " + dice);

                if (choose == 0) {
                    System.out.println("ladder");
                    positionOne = positionOne + dice;
                    if (positionOne > 100)
                        positionOne = positionOne - dice;
                } else if (choose == 1) {
                    System.out.println("snake");
                    positionOne = positionOne - dice;
                    if (positionOne < 0)
                        positionOne = 0;
                } else System.out.println("no play");
                positionOne = positionOne;

                System.out.println("1st player position = " + positionOne);
            } else {

                //player 2
                int choose = value.nextInt(3);
                System.out.println("dice pointing for player 2 : " + dice);
                if (choose == 0) {
                    System.out.println("ladder");
                    positionTwo = positionTwo + dice;
                    if (positionTwo > 100)
                        positionTwo = positionTwo - dice;
                } else if (choose == 1) {
                    System.out.println("snake");
                    positionTwo = positionTwo - dice;
                    if (positionTwo < 0)
                        positionTwo = 0;
                } else System.out.println("no play");
                positionTwo = positionTwo;

                System.out.println("2nd player position = " + positionTwo);
            }
        }
        // Output
        System.out.println("no of times dice rolled : " + count);
        if (positionOne == 100) {
            System.out.println("winner player 1 !! " + positionOne + "/100");
        } else System.out.println("winner player 2 !! " + positionTwo + "/100");
    }
}