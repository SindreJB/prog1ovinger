import java.util.GregorianCalendar;

class Person {
    private final int birthYear;
    private final String lastName;
    private final String firstName;

    public Person(int birthYear, String lastName, String firstName) {
        this.birthYear = birthYear;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

class ArbTaker extends Person {
    private final int arbTakerNr;
    private final int hireYear;
    private double monthlyWage;
    private double taxBracket;

    public ArbTaker(int birthYear, String firstName, String lastName, int arbTakerNr, int hireYear, double monthlyWage, double taxBracket) {
        super(birthYear, lastName, firstName);
        this.arbTakerNr = arbTakerNr;
        this.hireYear = hireYear;
        this.monthlyWage = monthlyWage;
        this.taxBracket = taxBracket;
    }

    public int getArbTakerNr() {
        return arbTakerNr;
    }

    public int getHireYear() {
        return hireYear;
    }

    public double getMonthlyWage() {
        return monthlyWage;
    }

    public double getTaxBracket() {
        return taxBracket;
    }

    public void setMonthlyWage(int newMonthlyWage) {
        this.monthlyWage = newMonthlyWage;
    }

    public void setTaxBracket(int newTaxBracket) {
        this.taxBracket = newTaxBracket;
    }

    public int age() {
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(GregorianCalendar.YEAR);
        return currentYear - getBirthYear();
    }

    public int yearsInCompany() {
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(GregorianCalendar.YEAR);
        return currentYear - getHireYear();
    }
}