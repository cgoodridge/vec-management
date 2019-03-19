public class Zythian extends Patron implements FeedingInterface
{
    private int energyLevel;

    public Zythian(String name)
    {
        this.name = name;
        symbol = 'z';
        type = "Zythian";
        energyLevel = 0;

    } // Zythian

    public int getEnergyLevel()
    {
        return energyLevel;
    } // getEnergyLevel

    public void setEnergyLevel(int mEnergyLevel)
    {
        energyLevel = mEnergyLevel;
    } // setEnergyLevel

    public void eatPatron(Patron patron)
    {

    } // eatPatron

    public void eatDish(int energy, char type) throws AsphyxiationException, GorgingException 
    {

    }

    public void eatScarion(int energy) throws GorgingException 
    {

    }

    public void eatZythian(int energy) throws AsphyxiationException, GorgingException 
    {

    }
}
