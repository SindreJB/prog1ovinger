import java.util.Scanner;

public class oppg1 {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write a sentence :D ");
            String userInput = scanner.nextLine();

            NyString main = new NyString(userInput);

            System.out.println(main.shortener());
            
        }
    }
}
