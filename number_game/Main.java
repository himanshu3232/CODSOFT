import java.util.Scanner;

public class Main {
    final static int NUMBER_OF_TURNS = 4;
    private static int currentTurn;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberGame numberGame = new NumberGame();
        while(currentTurn++<NUMBER_OF_TURNS){
            System.out.print("Guess a number: ");
            int input = sc.nextInt();
            numberGame.compare(input);
            if(numberGame.correctGuess) break;
        }
        System.out.println("Game Over!");
        sc.close();
    }
}
