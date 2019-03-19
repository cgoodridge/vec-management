public class Restaurant
{
    private Zythian zTable[];
    private Scanthian sTable[];

    public Restaurant()
    {

    } //Restaurant

    public void setUpDemo()
    {
        zTable = new Zythian[10];
        sTable = new Scanthian[10];

    } //setUpDemo

    public boolean fillSeat(int seat, Patron patron)
    {
        if (sTable[seat] != null)
        {
            return false;
        }

        if (patron instanceof Zythian)
        {
            // zTable[seat] = patron;
        }

        if (patron instanceof Scanthian)
        {
            // sTable[seat] = patron;
        }
        
        return true;
    }

    public boolean clearSeat(int seat, char type)
    {
        if (type == 's')
        {
            if (sTable[seat] == null)
            {
                return false;
            }
            else
            {
                sTable[seat] = null;
                return true;
            }
        }

        if (type == "z")
        {
            if (zTable[seat] == null)
            {
                return false;
            }
            else
            {
                zTable[seat] = null;
                return true;
            }
        }
    }

    public void displayTable()
    {
        
    }



}