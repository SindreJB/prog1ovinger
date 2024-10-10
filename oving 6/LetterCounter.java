import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Skriv inn en streng: ");
            String userInput = sc.nextLine();
            
            TekstAnalyse tekstAnalyse = new TekstAnalyse(userInput);
            tekstAnalyse.antallTegn();
        }
    }
}