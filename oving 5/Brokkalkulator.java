import java.util.Scanner;

public class Brokkalkulator {

    private int teller1, nevner1;
    private int teller2, nevner2; 

    public Brokkalkulator(int teller1, int nevner1, int teller2, int nevner2) {
        if (nevner1 == 0 || nevner2 == 0) {
            throw new ArithmeticException("Nevner kan ikke være null!");
        }
        this.teller1 = teller1;
        this.nevner1 = nevner1;
        this.teller2 = teller2;
        this.nevner2 = nevner2;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private String forenkle(int teller, int nevner) {
        int gcdValue = gcd(teller, nevner);
        teller /= gcdValue;
        nevner /= gcdValue;
        if (nevner == 1) {
            return String.valueOf(teller); 
        } else if (nevner < 0) {
            return (-teller) + "/" + (-nevner); 
        }
        return teller + "/" + nevner;
    }

    public void utregning(int operasjon) {
        int resultTeller;
        int resultNevner;

        switch (operasjon) {
            case 1 -> { 
                resultTeller = (teller1 * nevner2) + (teller2 * nevner1);
                resultNevner = nevner1 * nevner2;
                System.out.println("Resultat av addisjon: " + forenkle(resultTeller, resultNevner));
            }
            case 2 -> {  
                resultTeller = (teller1 * nevner2) - (teller2 * nevner1);
                resultNevner = nevner1 * nevner2;
                System.out.println("Resultat av subtraksjon: " + forenkle(resultTeller, resultNevner));
            }
            case 3 -> { 
                resultTeller = teller1 * teller2;
                resultNevner = nevner1 * nevner2;
                System.out.println("Resultat av multiplikasjon: " + forenkle(resultTeller, resultNevner));
            }
            case 4 -> { 
                if (teller2 == 0) {
                    throw new ArithmeticException("Kan ikke dele med 0!");
                }
                resultTeller = teller1 * nevner2;
                resultNevner = nevner1 * teller2;
                System.out.println("Resultat av divisjon: " + forenkle(resultTeller, resultNevner));
            }
            default -> System.out.println("Ugyldig operasjon!");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Skriv inn teller for første brøk: ");
            int teller1 = sc.nextInt();
            System.out.print("Skriv inn nevner for første brøk: ");
            int nevner1 = sc.nextInt();

            System.out.print("Skriv inn teller for andre brøk: ");
            int teller2 = sc.nextInt();
            System.out.print("Skriv inn nevner for andre brøk: ");
            int nevner2 = sc.nextInt();

            Brokkalkulator brokkalkulator = new Brokkalkulator(teller1, nevner1, teller2, nevner2);

            while (true) {
                System.out.println("Hvilken operasjon vil du gjennomføre?");
                System.out.println("1 - Addisjon");
                System.out.println("2 - Subtraksjon");
                System.out.println("3 - Multiplikasjon");
                System.out.println("4 - Divisjon");
                System.out.println("0 - Avslutt");

                if (sc.hasNextInt()) {
                    int operasjon = sc.nextInt();
                    if (operasjon == 0) {
                        System.out.println("Avslutter kalkulatoren.");
                        break;
                    }
                    brokkalkulator.utregning(operasjon);
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