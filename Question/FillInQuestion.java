import java.util.Scanner;
public class FillInQuestion extends Question
{
    //overrife the setTxxt method to extract the answer from the question test
    /* For Example:
     *  " The inventor of Java was _James Gosling_"
     *  
     *    text : "The inventor of Java was _____"
     *    answer: "James Gosling"
     */
    public void setText( String questionText )
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter ( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        //we have to explicitly state that we want to invoke the super class" setText method
        super.setText( question );
        
        //we dont have to specify anything before setAnswer, but we could specify this or super
        this.setAnswer( answer );
    }
}