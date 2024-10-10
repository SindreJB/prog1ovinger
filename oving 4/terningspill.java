public class terningspill {
    
    public static void main(String[] args) {
        Spiller spiller1 = new Spiller(0, "Player 1");
        Spiller spiller2 = new Spiller(0, "Player 2");
        spiller1.kastTerningen();
        spiller2.kastTerningen();
        spiller1.erFerdig();
        spiller2.erFerdig();
    }
}
