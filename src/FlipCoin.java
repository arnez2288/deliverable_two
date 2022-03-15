import java.util.*;
public class FlipCoin {
            public static void main(String[] args) {
                
            	int hCount = 0;
                int tCount = 0;
               
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Guess which will have more: heads or tails?");
                String headsOrTailsGuess = sc.nextLine();
                
                System.out.print("How many times do you want to flip a coin? ");
                int numberOfFlips = sc.nextInt();
                
                for (int i=0; i < numberOfFlips; i++) {
                    if (Math.random() < 0.5) {
                        System.out.println("Heads");
                        hCount++;
                    } else {
                        System.out.println("Tails");
                        tCount++;
                    }
                }
                    
                if (headsOrTailsGuess.equals("Heads") || headsOrTailsGuess.equals("heads")) {
                	System.out.println("Your guess, " +headsOrTailsGuess+ " , came up "+hCount+" time(s).");
                	int num1 = ( hCount*100)/numberOfFlips;	
                	System.out.println("That's "+num1+"%.");
                	}else {
                	System.out.println("Your guess, " +headsOrTailsGuess+ " , came up "+tCount+" time(s).");
                	int num2 = (tCount*100)/numberOfFlips;
                	System.out.println("That's "+num2+"%.");
                	
               }
        }
            
}
