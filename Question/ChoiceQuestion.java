


public class ChoiceQuestion extends Question
{
    private int numberOfChoices;
    
    public ChoiceQuestion()
    {
        super(); // call parent class constructor
        numberOfChoices = 0;
    }
    public void addChoice( String choice, Boolean correct )
    {
        numberOfChoices++;
        
        //for Example, "1) the text of the first choice"
        this.addText( "\n" + numberOfChoices+ ")" + choice );
       
        if ( correct )
        {
            String choiceString = "" + numberOfChoices;
            this.setAnswer( choiceString );
        }
    }
}
