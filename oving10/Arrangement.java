
public class Arrangement {
    
    private final String place;
    private final Long date;
    private final String host;
    private final String type;

    public Arrangement(String place, Long date, String host, String type) {

        this.place = place;
        this.date = date;
        this.host = host;
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public Long getDate() {
        return date;
    }

    public String getHost() {
        return host;
    }

    public String getType() {
        return type;
    }
}
