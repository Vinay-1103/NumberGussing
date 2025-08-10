import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        String play;
        do {
        Random rd=new Random();
        int secretNumber=rd.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        System.out.println("#*------------------------------*#");
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("#*------------------------------*#");
        System.out.println("Enter diffculty level (\\Easy\\Medium\\Hard)");
        String diffcultylevel= sc.next().toLowerCase(Locale.ROOT);
         int numofattempts=switch (diffcultylevel) {
             case "easy" -> 10;
             case "medium" -> 7;
             case "hard" -> 5;
             default -> -1;
         };
             if (numofattempts == -1) {
                 System.out.println("Invalid difficulty level. Please restart the game and choose a valid level.");
                 System.out.println("Do you want to play again? (yes/no): ");
                 play = sc.next().toLowerCase();
                 continue;
             }
        System.out.println("You have " + numofattempts + " attempts to guess the number");
        while (numofattempts>0) {
            System.out.println("Guess the number(1-100): ");
            int guess = sc.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("please enter valid No.");
                continue;
            }
            if (guess == secretNumber) {
                System.out.println("you have entered the correct number! you Won");
                break;
            } else {
                if (guess < secretNumber) {
                    System.out.println("Too Low.Try again...");
                } else {
                    System.out.println("\uD83D\uDE14Too High . Try again ...");
                }
                numofattempts--;
                if (numofattempts > 0) {
                    System.out.println("You have " + numofattempts + " attempts remaining.");
                } else {
                    System.out.println("No attempts left. You lost! The correct number was " + secretNumber);
                }
            }
        }
        System.out.println("Do you want to play again....(yes/no)");
        play= sc.next().toLowerCase();
       }while (play.equals("yes"));
        System.out.println("Thank you for playing! Goodbye!");
    }
}
