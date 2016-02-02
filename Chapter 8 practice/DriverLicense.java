

public class DriverLicense extends CardHierarchy
{
    String driverLicense;
    
    public DriverLicense(String name, String license)
    {
        super(name);
        driverLicense = license;
    }
    
    public String format()
    {
        String card = super.format();
        card += "/nLicense Number: " + driverLicense;
        
        return card;
    }
}