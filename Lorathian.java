public class Lorathian extends Patron 
{
    private boolean isBeserk;

    public Lorathian(String name)
    {
        this.name = name;
        symbol = 'l';
        type = "Lorathian";
        isBeserk = false;

    } // Lorathian

    public boolean getTruthValue()
    {
        return isBeserk;
    } // getTruthValue

    public void setTruthValue(boolean mIsBeserk) 
    {
        isBeserk = mIsBeserk;
    } // setTruthValue
}
