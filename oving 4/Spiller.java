

public class Spiller {
    
    private int sumPoeng;
    private int kastCount;
    private final String name;

    public Spiller(int sumPoeng, String name){
        this.sumPoeng = sumPoeng;
        this.kastCount = 0;
        this.name = name;
    }

    public int getSumPoeng(){
        return this.sumPoeng;
    }

    public void kastTerningen(){
        java.util.Random terning = new java.util.Random();
        while(true){
            int terningKast = terning.nextInt(1,6);
            if(terningKast == 1){
                this.sumPoeng = 0;                
            }else if (this.sumPoeng == 100){
                break;
            }else if (this.sumPoeng < 100){
                sumPoeng += terningKast;
            }else if ((this.sumPoeng + terningKast) > 100 ) {
                sumPoeng -= terningKast;
            }else{
                this.sumPoeng += terningKast;
            }    
            this.kastCount += 1;
        }
    }

    public void erFerdig(){
        if (this.sumPoeng == 100){
            System.out.printf("%s Ble ferdig på %d runder \n",name, kastCount);
        }
    }
}
