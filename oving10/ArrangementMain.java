import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrangementMain {
    
    static ArrangementRegister arr = new ArrangementRegister();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        // Add some sample data
        arr.addArrangement(new Arrangement("Oslo", 202410302000L, "Sindre", "Concert"));
        arr.addArrangement(new Arrangement("Bergen", 202411152000L, "Sindre", "Conference"));
        arr.addArrangement(new Arrangement("Trondheim", 202412012000L, "Guri", "Festival"));
        arr.addArrangement(new Arrangement("Stavanger", 202412252000L, "Kristian", "Exhibition"));
        arr.addArrangement(new Arrangement("Oslo", 202501012000L, "Selma", "Concert"));

        while (running) {
            System.out.println("1. Registrer arrangement");
            System.out.println("2. Skriv ut alle arrangementer");
            System.out.println("3. Finn arrangementer som er på et bestemt sted");
            System.out.println("4. Finn arrangementer som er på en bestemt dato");
            System.out.println("5. Finn arrangementer som er mellom to datoer");
            System.out.println("6. Avslutt");
                
            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Skriv inn sted: ");
                        String place = sc.nextLine();
                        System.out.println("Skriv inn dato yyyyMMddHHmm (e.g., 202410302000): ");
                        Long date = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Skriv inn arrangør: ");
                        String host = sc.nextLine();
                        System.out.println("Skriv inn type arrangement: ");
                        String type = sc.nextLine();

                        Arrangement arrangement = new Arrangement(place, date, host, type);
                        arr.addArrangement(arrangement);
                    }

                    case 2 -> {
                        System.out.println("Arrangementer i registeret: ");
                        arr.printArrangementer();
                    }

                    case 3 -> {
                        System.out.println("Skriv inn sted: ");
                        String place = sc.nextLine();
                        arr.findArrangementByPlace(place);
                    }

                    case 4 -> {
                        System.out.println("Skriv inn dato yyyyMMddHHmm (e.g., 202410302000): ");
                        Long date = sc.nextLong();
                        sc.nextLine();
                        arr.findArrangementByDate(date);
                    }

                    case 5 -> {
                        System.out.println("Skriv inn startdato yyyyMMddHHmm (e.g., 202410302000): ");
                        Long date1 = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Skriv inn sluttdato yyyyMMddHHmm (e.g., 202501012000): ");
                        Long date2 = sc.nextLong();
                        sc.nextLine();
                        arr.findArrangementBetweenDates(date1, date2);
                    }

                    case 6 -> {
                        running = false;
                        System.out.println("Avslutter programmet.");
                    }

                    default -> System.out.println("Ugyldig valg.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ugyldig input.");
                sc.nextLine(); // Consume the invalid input
            } catch (Exception e) {
                System.out.println("En feil oppstod: " + e.getMessage());
            }
        }
        sc.close();
    }
}
