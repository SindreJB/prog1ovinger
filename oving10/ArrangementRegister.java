import java.util.ArrayList;
import java.util.Collections;

public class ArrangementRegister {
    
    private ArrayList<Arrangement> arrangementer;

    public ArrangementRegister() {

        this.arrangementer = new ArrayList<>();
    }

    public ArrayList<Arrangement> getArrangementer() {
        return arrangementer;
    }

    public void addArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }

    public void printArrangementer() {

        Collections.sort(arrangementer, (Arrangement a1, Arrangement a2) -> a1.getDate().compareTo(a2.getDate()));

        for (Arrangement arrangement : arrangementer) {
            System.out.println("Sted: " + arrangement.getPlace());
            System.out.println("Dato: " + arrangement.getDate());
            System.out.println("Arrangør: " + arrangement.getHost());
            System.out.println();
        }
    }

    public void findArrangementByPlace(String place) {
        for (Arrangement arrangement : arrangementer) {
            if (arrangement.getPlace().equals(place)) {
                System.out.println("Sted: " + arrangement.getPlace());
                System.out.println("Dato: " + arrangement.getDate());
                System.out.println("Arrangør: " + arrangement.getHost());
                System.out.println();
            }
        }
    }

    public void findArrangementByDate(Long date) {
        for (Arrangement arrangement : arrangementer) {
            if (arrangement.getDate().equals(date)) {
                System.out.println("Sted: " + arrangement.getPlace());
                System.out.println("Dato: " + arrangement.getDate());
                System.out.println("Arrangør: " + arrangement.getHost());
                System.out.println();
            }
        }
    }

    public void findArrangementBetweenDates(Long date1, Long date2) {
        for (Arrangement arrangement : arrangementer) {
            if (arrangement.getDate().compareTo(date1) >= 0 && arrangement.getDate().compareTo(date2) <= 0) {
                System.out.println("Sted: " + arrangement.getPlace());
                System.out.println("Dato: " + arrangement.getDate());
                System.out.println("Arrangør: " + arrangement.getHost());
                System.out.println();
            }
        }
    }

}
