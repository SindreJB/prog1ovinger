import java.util.Random;
import java.util.Scanner;

public class MinRandom {

    private final int nedre;
    private final int ovre;

    public MinRandom(int nedre, int ovre) {
        this.nedre = nedre;
        this.ovre = ovre;
    }

    public int nesteHeltall() {
        Random heltall = new Random();
        return heltall.nextInt(nedre, ovre);
    }

    public double nesteDesimaltall() {
        Random desimaltall = new Random();
        return desimaltall.nextDouble(nedre, ovre); 
    }

    public void printRandom(int velg) {

        switch (velg) {
            case 1 -> {
                int printHeltall = nesteHeltall();
                System.out.println("Ditt tilfeldige heltall er " + printHeltall);
            }
            case 2 -> {
                double printDesimaltall = nesteDesimaltall();
                System.out.println("Ditt tilfeldige desimaltall er " + printDesimaltall);
            }
            default -> System.out.println("Ugyldig operasjon!");
        }
    }

    public static void main(String[] args) {       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Velg nedre grense i intervallet ditt: ");
            int nedre = sc.nextInt();

            System.out.print("Velg øvre grense i intervallet ditt: ");
            int ovre = sc.nextInt();

            MinRandom minRandom = new MinRandom(nedre, ovre);

            while (true) {
                System.out.println("Vil du få heltall eller desimaltall?");
                System.out.println("1 - Heltall");
                System.out.println("2 - Desimaltall");
                System.out.println("0 - Avslutt");

                if (sc.hasNextInt()) {
                    int velg = sc.nextInt();
                    if (velg == 0) {
                        System.out.println("Avslutter");
                        break;
                    }
                    minRandom.printRandom(velg);
                } else {
                    System.out.println("Ugyldig input! Prøv igjen.");
                    sc.next();
                }
            }
        } catch (Exception e) {
            System.out.println("Feil: " + e.getMessage());
        }
    }
}
