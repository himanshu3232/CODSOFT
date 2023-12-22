import java.util.Random;
final class NumberGame{
    Random random = new Random();
    //By default, it ranges from 0 to 99 adding 1 to change its scope to 1 to 100
    int randomNum = random.nextInt(100) + 1;
    boolean correctGuess;
    void compare(int num){
        String output = (num==randomNum) ? "Congratulations! Your Guess is correct!" :
                (Math.abs(num-randomNum)>=50) ? "Your guess is too far off!" :
                        (Math.abs(num-randomNum)>10) ? "Your guess is out of the range of 20!" :
                                "Your guess is within the range of 20!";

        correctGuess = num == randomNum;
        System.out.println(output);
    }
}