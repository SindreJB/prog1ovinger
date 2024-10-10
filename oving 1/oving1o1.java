import java.util.Scanner;

public class oving1o1{

    public static void main(String[] args) {
        try (Scanner myobj = new Scanner(System.in)) {
            int antTommer;

            //skriv inn antall tommer du vil konvertere til cm
            System.out.println("hvor mange tommer vil du konvertere?");
            antTommer = Integer.parseInt(myobj.nextLine());
            
            System.out.println(tommeTilCm(antTommer)+" cm");
        } catch (NumberFormatException e) {
            System.out.println("FEIL SKRIV TALL NESTE GANG");
        }
    }
    static double tommeTilCm(double tommer){
        return tommer*2.54;
    }

}