import java.util.Random;

public class NullTilNi {

    private int rand0; 
    private int rand1; 
    private int rand2; 
    private int rand3; 
    private int rand4; 
    private int rand5; 
    private int rand6; 
    private int rand7; 
    private int rand8; 
    private int rand9;

    public NullTilNi() {
        this.rand0 = 0;
        this.rand1 = 0;
        this.rand2 = 0;
        this.rand3 = 0;
        this.rand4 = 0;
        this.rand5 = 0;
        this.rand6 = 0;
        this.rand7 = 0;
        this.rand8 = 0;
        this.rand9 = 0;
    }

    public int nesteRandom() {
        Random heltall = new Random();
        return heltall.nextInt(10);
    }

    public void nullTilNiTabell() {
        switch(nesteRandom()) {
            case 0 -> rand0 += 1;
            case 1 -> rand1 += 1;
            case 2 -> rand2 += 1;
            case 3 -> rand3 += 1;
            case 4 -> rand4 += 1;
            case 5 -> rand5 += 1;
            case 6 -> rand6 += 1;
            case 7 -> rand7 += 1;
            case 8 -> rand8 += 1;
            case 9 -> rand9 += 1;
        }
    }

    public void printResults() {
        System.out.println("0: " + rand0);
        System.out.println("1: " + rand1);
        System.out.println("2: " + rand2);
        System.out.println("3: " + rand3);
        System.out.println("4: " + rand4);
        System.out.println("5: " + rand5);
        System.out.println("6: " + rand6);
        System.out.println("7: " + rand7);
        System.out.println("8: " + rand8);
        System.out.println("9: " + rand9);
    }

    public static void main(String[] args) {
        NullTilNi nullTilNi = new NullTilNi(); 
        
        for (int i = 0; i < 1000; i++) {
            nullTilNi.nullTilNiTabell();
        }

        nullTilNi.printResults();
    }
}
