import java.util.Scanner;

public class oving1o3{
    public static void main(String[] args) {
        try (Scanner myobj = new Scanner(System.in)) {
            int antSek;

            //skriv inn antall sekunder du vil konvertere til timer, min og sek
            System.out.println("hvor mange sekunder vil du konvertere?");
            antSek = Integer.parseInt(myobj.nextLine());
            
            System.out.println(sekTilTall(antSek));
        } catch (NumberFormatException e) {
            System.out.println("FEIL SKRIV TALL NESTE GANG");
        }
    }
    static int sekTilTall(int totalTid){
        int timerGatt = totalTid/3600;
        totalTid = totalTid - (timerGatt*3600);
        int minGatt = totalTid/60;
        totalTid = totalTid - (minGatt*60);
        

        System.out.println(timerGatt);
        System.err.println(minGatt);
        return totalTid;
}


}