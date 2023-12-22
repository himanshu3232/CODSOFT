import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberGame numberGame = new NumberGame();
        while(!numberGame.correctGuess){
            System.out.print("Guess a number: ");
            int input = sc.nextInt();
            numberGame.compare(input);
            if(numberGame.correctGuess) break;
        }
        System.out.println("Game Over!");
        sc.close();
    }
}
