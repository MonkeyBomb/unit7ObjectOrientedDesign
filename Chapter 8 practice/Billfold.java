
public class Billfold extends CardHierarchy
{
    CardHierarchy card1;
    CardHierarchy card2;
    
    public Billfold()
    {
        card1 = null;
        card2 = null;
    }
    
    public void addCard(CardHierarchy newCard)
    {
        if (card1 == null)
        {
            card1 = newCard;
        }
        
        else if (card2 == null)
        {
             card2 = newCard;
        }
    }
    
    public String formatCards()
    {
        String card = "[" + card1.format() + "|" + card2.format() + "]";
        
        return card;
    }
}