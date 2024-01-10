import java.util.Random;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int solution = randomNum.nextInt(10) + 1;
        Scanner userInputScanner = new Scanner(System.in);
        takeGuess(solution, userInputScanner);
    }
    static void takeGuess(int solution, Scanner userInput) {
        int guess = userInput.nextInt();
        if (guess == solution) {
            System.out.println("Winner");
        } else if (guess > solution) {
            System.out.println("High!! Guess again");
            takeGuess(solution, userInput);
        } else {
            System.out.println("Low!! Guess again");
            takeGuess(solution, userInput);
        }
    }
}