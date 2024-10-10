import java.util.Scanner;

public class oving1o2 {
    public static void main(String[] args) {
        try (Scanner myobj1 = new Scanner(System.in)) {
            int [] time = {0,0,0};
            //skriv inn antall tommer du vil konvertere til cm
            System.out.println("hvor mange timer? ");
            time[0] = Integer.parseInt(myobj1.nextLine());
            System.out.println( "Hvor mange minutter? ");
            time[1] = Integer.parseInt(myobj1.nextLine());
            System.out.println("hvor mange sekunder? ");
            time[2] = Integer.parseInt(myobj1.nextLine());

            System.out.println(timetoseconds(time) + " sekunder");
            //System.out.println(tommeTilCm(antTommer)+" cm");
        } catch (NumberFormatException e) {
            System.out.println("FEIL SKRIV TALL NESTE GANG");
        }
    }
    static int timetoseconds(int [] time ){
        return time[0]*3600+time[1]*60+time[2];
    }

}