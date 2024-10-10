
public class valutakalkulator {
    
    public static void main(String args[]){
        Valuta valuta = new Valuta(1000);
        valuta.showMenu();
        valuta.konvertere();
        System.out.println(valuta.getSaldo());

    }
}

