

public class IDCard extends CardHierarchy
{
    String idNumber;
    
    public IDCard(String name, String id)
    {
        super(name);
        idNumber = id;
    }
    
    public String format()
    {
        String card = super.format();
        card += "/niID Number " + idNumber;
        
        return card;
    }
}