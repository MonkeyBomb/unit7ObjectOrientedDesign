

public class IDCard extends CardHierarchy
{
    private String idNumber;
    
    public IDCard(String name, String id)
    {
        super(name);
        idNumber = id;
    }
    
    public boolean equals( Object other )
    {
        //check if this object and the other object are both instances of the smae class
        if( this.getClass() == other.getClass())
        {
            // since both objects are instances of IDCard, it is okay to cast othjer to an IDCard reference
            IDCard otherIDCard = (IDCard) other;
            
            boolean isEqual = super.equals(otherIDCard);
            return isEqual && idNumber.equals( otherIDCard.idNumber );
        }
        
        return false;
    }
    
    public String format()
    {
        String card = super.format();
        card += "/niID Number " + idNumber;
        
        return card;
    }
}