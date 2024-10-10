        
import java.util.Scanner;

          public class skuddAr{

            public static void main(String[] args) {
                skuddAar();         
            }
            
            static void skuddAar() {
                try (Scanner myobj = new Scanner(System.in)) {
                    System.out.println("Skriv inn et årstall. ");
                    int arstall = Integer.parseInt(myobj.nextLine());
                    if (arstall % 400 == 0){
                        System.out.println("Dette er et skuddår:)");

                    }else if (arstall % 100 == 0){
                        System.out.println("Dette er IKKE et skuddår:(");
                        
                    }else if (arstall % 4 == 0) {
                        System.out.println("Dette er et skuddår:)");
                    } 
                    else {
                        System.out.println("Dette er IKKE et skuddår:(");
                    }
                } catch (NumberFormatException e) {
                }                
            }         
        }
        