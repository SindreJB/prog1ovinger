import java.util.Scanner;
public class primtall {
    
    public static void main(String[] args) {     
        utregning();
    }
    
    public static void utregning() {
        int tallLn;
        int i, flag;
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Skriv inn tallet du vil sjekke om er et primtall ");
            tallLn = Integer.parseInt(myObj.nextLine());
            flag = 0;
        }
        
        
        if(tallLn <= 1){
            System.out.println(tallLn + " er ikke et primtall.");
        }
        else{
            for (i = 2; i <= tallLn / 2; i++) {
                if (tallLn % i == 0 /*|| tallLn % (i + 2) == 0*/) {
                System.out.println(tallLn + " er ikke et primtall.");
                flag = 1;
            break;
        }
        }
        if(flag == 0) {
            System.out.println(tallLn + " er et primtall.");
        }
    }
}
}
    
