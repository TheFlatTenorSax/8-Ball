import java.util.Random;
import java.util.Scanner;
public class EightBall {
    public static void main(String[] args) {
        Scanner ateball = new Scanner(System.in);
        Scanner anotherone = new Scanner(System.in);
        boolean keepGoing = true;
        String Input;
        String userInput;


        String [] arr = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes, definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."};
        Random random = new Random();
            

      
        while(keepGoing){
            System.out.println("A question you give and an answer I will provide!");
            userInput = ateball.nextLine();
            
            
            int select = random.nextInt(arr.length);
            System.out.println(arr[select]); 
            
            

            System.out.println("Shake the 8ball again? (Please use: (Yes, or No)");
            Input = anotherone.nextLine();

            if(Input.equals("Yes")) {
                keepGoing = true;
                System.out.println("Alright, shaking again...");
            } else if(Input.equals("No")) {
                keepGoing = false;
                System.out.println("Then go put the 8ball back on the store shelf from where you picked it up >:(");
            } 
            
        }
        // Closes the Scanners
        ateball.close();
        anotherone.close();
        
    }
}
