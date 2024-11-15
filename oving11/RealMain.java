import java.util.Scanner;

/*
 * The class RealMain is a class that contains the main method.
 * The class has a main method that creates a RERegistry object and adds RealEstate objects to the list.
 * 
 */

public class RealMain {
    
    public static void main(String[] args) {

        RERegistry registry = new RERegistry();

        registry.addRealEstate(new RealEstate(1445, "Gloppen",  77, 631, "", 1017.6, "Jens Olsen"));
        registry.addRealEstate(new RealEstate(1445, "Gloppen",  77, 131, "Syningom", 661.3, "Nicolay Olsen"));
        registry.addRealEstate(new RealEstate(1445, "Gloppen",  75, 19, "Fugletun", 650.6, "Evelyn Jensen"));
        registry.addRealEstate(new RealEstate(1445, "Gloppen",  74, 188, "", 1457.2, "Karl Ove Braaten"));
        registry.addRealEstate(new RealEstate(1445, "Gloppen",  69, 47, "Hoiberg", 1339.4, "Elsa Indregaard"));
        //adds RealEstate objects to the list

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        //creates a new Scanner object and initializes the boolean "running" to true

        while (running) {
            System.out.println("1. Registrer eiendom");
            System.out.println("2. Skriv ut alle eiendommer");
            System.out.println("3. Søk etter eiendom");
            System.out.println("4. Søk i gaardsnummer");
            System.out.println("5. Skriv ut gjennomsnittlig areal");
            System.out.println("6. Slett eiendom");
            System.out.println("7. Avslutt");
            //prints out the menu

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Skriv inn kommunenummer:");
                        int municipalityNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Skriv inn kommunenavn:");
                        String municipalityName = sc.nextLine();
                        System.out.println("Skriv inn tomtenummer:");
                        int lotNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Skriv inn bruksnummer:");
                        int sectionNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Skriv inn tomtenavn:");
                        String lotName = sc.nextLine();
                        System.out.println("Skriv inn areal:");
                        double area = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Skriv inn eier:");
                        String owner = sc.nextLine();
                        //reads necessary input from the user

                        registry.addRealEstate(new RealEstate(municipalityNumber, municipalityName, lotNumber, sectionNumber, lotName, area, owner));
                        //adds a new RealEstate object to the list with the given values
                    }
                    case 2 -> {
                        System.out.println("Antall eiendommer: " + registry.amountOfRealEstates());
                        for (RealEstate re : registry.getRealEstates()) {
                            System.out.println("Eier: " + re.owner);
                            System.out.println("Areal: " + re.area + " m^2");
                            System.out.println("Kommune: " + re.municipalityName + " (" + re.municipalityNumber + ")");
                            System.out.println("Tomte- og bruksnr. : " + re.lotNumber + " " + re.sectionNumber + " " + re.lotName);
                            System.out.println("____________________________________________"); 
                            //prints out the values of the RealEstate objects in the list              
                            }
                    }
                    case 3 -> {
                        System.out.println("Skriv inn kommunenummer:");
                        int municipalityNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Skriv inn tomtenummer:");
                        int lotNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Skriv inn bruksnummer:");
                        int sectionNumber = sc.nextInt();
                        sc.nextLine();
                        //reads necessary input from the user

                        boolean found = false; //initializes the boolean "found" to false
                        for (RealEstate re : registry.getRealEstates()) {
                            if (re.municipalityNumber == municipalityNumber && re.lotNumber == lotNumber && re.sectionNumber == sectionNumber) {
                                System.out.println("Eier: " + re.owner);
                                System.out.println("Areal: " + re.area + " m^2");
                                System.out.println("Kommune: " + re.municipalityName + " (" + re.municipalityNumber + ")");
                                System.out.println("Tomte- og bruksnr. : " + re.lotNumber + " " + re.sectionNumber + " " + re.lotName);
                                found = true;
                                //if the values of the RealEstate object match the given values, the values are printed out
                            }
                        }
                        if (!found) {
                            System.out.println("Fant ingen eiendommer med de gitte verdiene.");
                            //if no RealEstate objects match the given values, a message is printed out
                        }
                    }
                    case 4 -> {
                        System.out.println("Skriv inn tomtenummer:");
                        int lotNumber = sc.nextInt();
                        sc.nextLine();

                        for (RealEstate re : registry.getRealEstates()) {
                            if (re.lotNumber == lotNumber) {
                                System.out.println("Eier: " + re.owner);
                                System.out.println("Areal: " + re.area + " m^2");
                                System.out.println("Kommune: " + re.municipalityName + " (" + re.municipalityNumber + ")");
                                System.out.println("Tomte- og bruksnr. : " + re.lotNumber + " " + re.sectionNumber + " " + re.lotName);
                                System.out.println("____________________________________________");
                                //if a RealEstate object with the given value is found, the values are printed out
                            }
                        }
                    }
                    case 5 -> {
                        double avgArea = registry.avgArea();
                        System.out.println("Gjennomsnittlig areal: " + avgArea + " m^2");
                        //prints out the average area of the RealEstate objects in the list
                    }
                    case 6 -> {
                        System.out.println("Skriv inn kommunenummer:");
                        int municipalityNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Skriv inn tomtenummer:");
                        int lotNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Skriv inn bruksnummer:");
                        int sectionNumber = sc.nextInt();
                        sc.nextLine();
                        //reads necessary input from the user

                        registry.removeRealEstate(municipalityNumber, lotNumber, sectionNumber);
                        //removes the RealEstate object with the given values from the list
                    }
                    case 7 -> {
                        running = false;
                        System.out.println("Avslutter..");
                        //sets the boolean "running" to false and prints out a message, ending the program
                    }
                    default -> System.out.println("Ugyldig valg.");
                    //prints out a message if the input is invalid
                }
            } catch (Exception e) {
                System.out.println("Ugyldig input.");
                sc.nextLine();
                //prints out a message if the input is invalid
            }
        }
        sc.close();
        //closes the Scanner object
    }
}
