import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder Program");
        int position = 0;
        System.out.println("Position = "+position);
        Random value = new Random();
        int dice = value.nextInt(6)+1;
        System.out.println("Random number is "+dice);
    }
}