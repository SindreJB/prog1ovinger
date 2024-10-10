import java.util.Scanner;

public class Valuta {
    //Field
    private double saldo;
    private final double euroKurs;
    private final double dollarKurs;
    private final double dkkKurs;
    private int kurs;

    public Valuta(int saldo){
        this.saldo = saldo;
        this.euroKurs = 11.94;
        this.dollarKurs = 10.81;
        this.dkkKurs = 1.60;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void konvertere(){
        switch (this.kurs) {
            case 1 -> this.saldo /= this.euroKurs;
            case 2 -> this.saldo /= this.dollarKurs;
            case 3 -> this.saldo /= this.dkkKurs;
            case 4 -> this.saldo *= this.euroKurs;
            case 5 -> this.saldo *= this.dollarKurs;
            case 6 -> this.saldo *= this.dkkKurs;
            default -> {}
        }
    }

    public void showMenu(){
        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.println("Press 1 fra NOK til EURO");
                System.out.println("Press 2 fra NOK til USD");
                System.out.println("Press 3 fra NOK til DKK");
                System.out.println("Press 4 fra EURO til NOK");
                System.out.println("Press 5 fra USD til NOK");
                System.out.println("Press 6 fra DKK til NOK");
                if (sc.hasNextInt()) {
                    this.kurs = sc.nextInt();
                    break;
                } else {
                    System.out.println("Velg muligheter fra menyen");
                    sc.next();
                }
            }
        }
    }
}
