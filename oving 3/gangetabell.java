import java.util.Scanner;
public class gangetabell{

    public static void main(String[] args) {
       lokke(); 
    }
    static void lokke(){
        
        int numberOfLines = 11;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hvilken gangetabell vil du lese? ");

        int tabell = Integer.parseInt(myObj.nextLine());
        for (int i = 0; i < 5; i++) {
            for(int forCount = 2; forCount < numberOfLines;forCount++){
                System.out.println(tabell + " gangen:" + tabell*forCount);
            myObj.close();
            }
        }
       
        int tabell2 = tabell + 1;
        for(int forCount = 1; forCount < numberOfLines;forCount++){
            System.out.println(tabell2 + " gangen:" + tabell2*forCount);
        }
        int tabell3 = tabell + 2;
        for(int forCount = 1; forCount < numberOfLines;forCount++){
            System.out.println(tabell3 + " gangen:" + tabell3*forCount);
        }
    }
}