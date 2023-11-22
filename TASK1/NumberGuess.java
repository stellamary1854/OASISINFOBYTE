import java.util.*;
public class NumberGuess
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int lowerBound=1;
        int upperBound=100;
        int generatedNum=ran.nextInt(upperBound-lowerBound+1)+lowerBound;
        int maxAttempts;
        System.out.println("Enter maximum number of attempts:");
        maxAttempts = sc.nextInt();
        int attempts=0;
        int score=0;
        System.out.println("Welcome to the Number Guessing Game");

      

        System.out.println("Try to guess the number between" + lowerBound+"and" + upperBound);
        while(attempts<maxAttempts)
        {
            System.out.print("Enter your guess:");
            int userGuess = sc.nextInt();
            attempts++;
            if(userGuess==generatedNum)
            {
                System.out.println("Congratulations!! You guessed the number in" +attempts+"attempts.");
                score +=(maxAttempts-attempts+1)*10;
                System.out.println("Your score:"+score);
                System.out.println("Do you want to play again?(Yes/No)");
                String playAgain=sc.next().toLowerCase();
                if(playAgain.equals("yes"))
                {
                    generatedNum = ran.nextInt(upperBound-lowerBound+1)+lowerBound;
                    attempts=0;
                }
                else
                {
                    System.out.println("Thanks for playing.Goodbye!!");
                    break;
                }

            } 
            else
            {
                System.out.println("Wrong Guess !!, The number is "+((userGuess<generatedNum)?"higher.":"lower."));
            }
        }
        if(attempts==maxAttempts)
        {
            System.out.println("Sorry,you've reached the maximum number of attempts.The correct number is:"+generatedNum);
        }
    }

}
