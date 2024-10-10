

public class kjottbolle {

    public static void main(String[] args) {
        pris();
    }
    static void pris(){
        double kjott1 = 35.9 / 0.45;
        double kjott2 = 49.5 / 0.5;
        
        
        if (kjott1 < kjott2){
            System.out.println("Kjøttdeig 1 er billigst per kg.");
        }else if (kjott1 > kjott2){
            System.out.println("Kjøttdeig 2 er billigst per kg.");
            
    }
}
}