public interface FeedingInterface
{

    void eatDish(int energy, char type) throws AsphyxiationException, GorgingException;

    void eatScarion(int energy) throws GorgingException;

    void eatZythian(int energy) throws AsphyxiationException, GorgingException;
    
}