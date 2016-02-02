

public class CallingCard extends CardHierarchy
{
    String address;
    
    public CallingCard(String name, String address)
    {
        super(name);
        this.address = address;
    }
    
    public String format()
    {
        String card = super.format();
        card += "/nAddress: " + address;
        
        return card;
    }
}