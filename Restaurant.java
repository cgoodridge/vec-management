public class Restaurant
{
    private Zythian zTable[];
    private Scanthian sTable[];
    private Zythian zSeat;
    private Scanthian sSeat; 

    public Restaurant()
    {

    } //Restaurant

    public void setUpDemo()
    {
        zTable = new Zythian[10];
        sTable = new Scanthian[10];

        int param = 0;


        for (int i = 0; i < zTable.length; i++)
        {
            switch(param)
                {
                    case 1:
                        fillSeat(i, new Zythian("Bob"));
                        break;
                    case 2:
                        fillSeat(i, new Zythian("Kevin"));
                        break;
                    case 3:
                        fillSeat(i, new Zythian("Bob"));
                        break;
                    case 4:
                        fillSeat(i, new Zythian("Bob"));
                        break;
                    case 5:
                        fillSeat(i, new Zythian("Bob"));
                        break;
                    case 6:
                        fillSeat(i, new Zythian("Bob"));
                        break;
                    default:
                        return;
                }
        }

    } //setUpDemo

    public boolean fillSeat(int seat, Patron patron)
    {
        if (sTable[seat] != null)
        {
            return false;
        }

        if (patron instanceof Zythian)
        {
            zTable[seat] = zSeat;
        }

        if (patron instanceof Scanthian)
        {
            sTable[seat] = sSeat;
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
            }
        }
        

        if (type == 'z')
        {
            if (zTable[seat] == null)
            {
                return false;
            }
            else
            {
                zTable[seat] = null;
            }
        }
        return true;

    }

    public void displayTable()
    {
        for (int i = 0; i < 10; i++)
        {
            if(zTable[i] == null)
            {
                System.out.print(" " + '-' + " " + "|");
            }
            
            else
            {
                System.out.print(" " + zTable[i].getSymbol() + " " + "|");
            }   
            
        }
    }



}