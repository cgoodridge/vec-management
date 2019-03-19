public class Patron 
{
    protected String name;
    protected char symbol;
    protected String type;

    public Patron()
    {
        name = "??";
        symbol = '?';
        type = "?";
    } // Patron

    public String getName() 
    {
        return name;
    } // getName

    public void setName(String mName)
    {
        name = mName;
    } // setName

    public char getSymbol() 
    {
        return symbol;
    } // getSymbol

    public void setSymbol(char mSymbol)
    {
        symbol = mSymbol;
    } // setSymbol

    public String getType() 
    {
        return type;
    } // getType

    public void setType(String mType)
    {
        type = mType;
    } // setType

}