import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder Program");
        int position = 0;
        System.out.println("Initial Position = " + position);
        Random value = new Random();
        while (position < 100) {
            int dice = value.nextInt(6) + 1;
            System.out.println("dice pointing : " + dice);

            int choose = value.nextInt(3);
            if (choose == 0) {
                //ladder
                position = position + dice;
                if (position > 100)
                    position = position - dice;
            } else if (choose == 1) {
                //snake
                position = position - dice;
                if (position < 0)
                    position = 0;
            } else
                position = position;
            System.out.println("Current Position = " + position);
        }
    }
}