import java.util.ArrayList;
/*
 * The class RERegistry is a class that contains a list of RealEstate objects.
 * The class has a method that calculates the average area of all RealEstate objects in the list.
 * The class has a method that adds a RealEstate object to the list.
 * 
 * @Param realEstates is a list of RealEstate objects
 * 
 */
public class RERegistry {
    private ArrayList<RealEstate> realEstates;

    public RERegistry() {
        this.realEstates = new ArrayList<>();
    }

    public void addRealEstate(RealEstate realEstate) {
        realEstates.add(realEstate);
    }

    public ArrayList<RealEstate> getRealEstates() {
        return realEstates;
    }

    public double avgArea() {
        if (realEstates.isEmpty()) {
            return 0; // Avoid division by zero
        }
        double totalArea = 0;   //initializes the value "totalArea" to 0
        for (RealEstate re : realEstates) {
            totalArea += re.area; //"totalArea" is incremented by the value of the area of the current RealEstate object
        }
        return totalArea / realEstates.size(); 
        //takes all values of the area of the RealEstate objects and divides it by the number of RealEstate objects
    }

    public void removeRealEstate(int municipalityNumber, int lotNumber, int sectionNumber) {
        for (int i = 0; i < realEstates.size(); i++) { //Loops through all indexes of RealEstate objects in the list
            RealEstate re = realEstates.get(i);
            if (re.municipalityNumber == municipalityNumber && re.lotNumber == lotNumber && re.sectionNumber == sectionNumber) {
                //if the values of the RealEstate object match the given values, the object is removed from the list
                realEstates.remove(i);
                return;
            }
        }
    }

    public int amountOfRealEstates() {
        return realEstates.size(); //returns the number of RealEstate objects in the list
    }

    public RealEstate searchLotNr(int lotNumber) {
        for (RealEstate re : realEstates) { //Loops through all RealEstate objects in the list
            if (re.lotNumber == lotNumber) {
                return re;
            }
        }
        return null;
    }

}
