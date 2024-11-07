import java.util.ArrayList;
import java.util.Scanner;

public class oppg8 {

    static ArrayList<Person> personList = new ArrayList<>();
    static ArrayList<ArbTaker> arbTakerList = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            boolean running = true;

            while (running) {
                System.out.println("Velg en operasjon: ");
                System.out.println("1. Legg inn ny person ");
                System.out.println("2. Opprett ny arbeidstakerprofil ");
                System.out.println("3. Hent informasjon om person eller arbeidstaker ");
                System.out.println("4. Exit program");
                System.out.print("Skriv inn valg (1-4): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Skriv inn fornavn: ");
                        String firstName = scanner.next();
                        System.out.print("Skriv inn etternavn: ");
                        String lastName = scanner.next();
                        System.out.print("Skriv inn fødselsår: ");
                        int birthYear = scanner.nextInt();

                        Person person = new Person(birthYear, lastName, firstName);
                        personList.add(person);
                        System.out.println("Person opprettet: " + person.getFirstName() + " " + person.getLastName() + ", født i " + person.getBirthYear());
                    }

                    case 2 -> {
                        System.out.print("Skriv inn fornavn: ");
                        String firstName = scanner.next();
                        System.out.print("Skriv inn etternavn: ");
                        String lastName = scanner.next();
                        System.out.print("Skriv inn fødselsår: ");
                        int birthYear = scanner.nextInt();
                        System.out.print("Skriv inn arbeidstakernummer: ");
                        int arbTakerNr = scanner.nextInt();
                        System.out.print("Skriv inn ansettelsesår: ");
                        int hireYear = scanner.nextInt();
                        System.out.print("Skriv inn månedslønn: ");
                        int monthlyWage = scanner.nextInt();
                        System.out.print("Skriv inn skatteprosent: ");
                        int taxBracket = scanner.nextInt();

                        ArbTaker arbTaker = new ArbTaker(birthYear, firstName, lastName, arbTakerNr, hireYear, monthlyWage, taxBracket);
                        arbTakerList.add(arbTaker);
                        System.out.println("Arbeidstakerprofil opprettet for: " + arbTaker.getFirstName() + " " + arbTaker.getLastName());
                    }

                    case 3 -> {
                        System.out.print("Skriv inn fornavn: ");
                        String searchFirstName = scanner.next();
                        System.out.print("Skriv inn etternavn: ");
                        String searchLastName = scanner.next();

                        ArrayList<Person> results = searchByName(searchFirstName, searchLastName);

                        if (results.isEmpty()) {
                            System.out.println("Ingen treff funnet.");
                        } else {
                            for (Person p : results) {
                                System.out.println("Navn: " + p.getFirstName() + " " + p.getLastName() + ", Fødselsår: " + p.getBirthYear());

                                if (p instanceof ArbTaker arbTaker) {
                                    System.out.println("Alder: " + arbTaker.age());
                                    System.out.println("År i bedriften: " + arbTaker.yearsInCompany());
                                    System.out.println("Bruttolønn årlig: " + ((arbTaker.getMonthlyWage() * 12) - ((arbTaker.getMonthlyWage() * 10.5) * arbTaker.getTaxBracket() / 100)));
                                    System.out.println("Skattetrekk årlig: " + ((arbTaker.getMonthlyWage() * 10.5) * arbTaker.getTaxBracket() / 100));
                                    if (arbTaker.yearsInCompany() >= 5){
                                        System.out.println("Har jobbet der i mer enn 5 år. ");
                                    }else{
                                        System.out.println("Har ikke jobbet der i mer enn 5 år. ");
                                    }

                                }
                                System.out.println();
                            }
                        }
                    }

                    case 4 -> {
                        System.out.println("Forlater programmet...");
                        running = false;
                    }

                    default -> System.out.println("Ugyldig valg.");
                }
            }
        }
    }

    public static ArrayList<Person> searchByName(String firstName, String lastName) {
        ArrayList<Person> results = new ArrayList<>();

        for (Person person : personList) {
            if (person.getFirstName().equalsIgnoreCase(firstName) && person.getLastName().equalsIgnoreCase(lastName)) {
                results.add(person);
            }
        }

        for (ArbTaker arbTaker : arbTakerList) {
            if (arbTaker.getFirstName().equalsIgnoreCase(firstName) && arbTaker.getLastName().equalsIgnoreCase(lastName)) {
                results.add(arbTaker);
            }
        }

        return results;
    }

}
