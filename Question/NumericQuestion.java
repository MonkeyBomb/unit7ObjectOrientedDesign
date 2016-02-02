public class NumericQuestion extends Question
{
    private double answer;
    public void setANswer( double correctResponse)
    {
        this.answer = correctResponse;
    }
    public boolean checkAmswer( String response)
    {
        double responseAsDouble = Double.parseDouble( response);
        return Math.abs( responseAsDouble - answer ) <= 0.01; 
    }
}
