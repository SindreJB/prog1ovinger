/*
 * Class representing a real estate object.
 * 
 * @Param municipalityNumber is the number of the municipality
 * @Param municipalityName is the name of the municipality
 * @Param lotNumber is the number of the lot
 * @Param sectionNumber is the number of the section
 * @Param lotName is the name of the lot
 * @Param area is the area of the lot
 * @Param owner is the owner of the lot
 * 
 */

public class RealEstate {
    
    public int municipalityNumber;
    public String municipalityName;
    public int lotNumber;
    public int sectionNumber;
    public String lotName;
    public double area;
    public String owner;

    public RealEstate(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String lotName, double area, String owner) {
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.lotName = lotName;
        this.area = area;
        this.owner = owner;
    }

}
