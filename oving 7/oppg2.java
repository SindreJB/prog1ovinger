
import java.util.Scanner;

public class oppg2 {
    public static void main(String[] args) {
        try (Scanner S = new Scanner(System.in)) {
            System.out.println("Skriv inn en setning. ");
            TextMaster Main = new TextMaster(S.nextLine());
            
            System.out.println("Antall setninger: ");
            System.out.println(Main.sentenceAmount());
            
            System.out.println("Snittlengde ord: ");
            System.out.println(Main.averageWordLength());
            
            System.out.println("Gjennomsnittlig ordlengde per setning: ");
            System.out.println(Main.averageWordLengthSentence());
            
            System.out.println("Print originalteksten: ");
            System.out.println(Main.getString());
            
            System.out.println("Print originalteksten i store bokstaver:");
            System.out.println(Main.getStringtoUpper());
            
            System.out.println("Bytt ut et ord med et annet: ");
            System.out.println(Main.replaceWord("hei", "hallo"));
        }
    }
}