public class Monster  extends Enemy
{
    String terrain;

    public Monster(String name, int might, boolean isHostile, String terrain)
    {
        super(name, might, isHostile);
        this.terrain = terrain;
    }// end full constructor

    public Monster()
    {
        super();
        terrain = "Land";
    }//end null constructor

    //Brain methods
    public String mightReact()
    {
        if (might < 10)
        {
            return "Weak";
        }
        else if(might >= 10 && might < 20)
        {
            return "Be careful!";
        }
        else //(might > 20);
        {
            return "Too strong";
        }
    }

    public String compareTerrain()
    {
        if (terrain.equalsIgnoreCase("Land"))
        {
            return "You can escape by running";
        }
        else if (terrain.equalsIgnoreCase("water"))
        {
            return "You can swim away!";
        }
        else
        {
            return "Good luck with that";
        }
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tTerrain = " + terrain;
    } // end toString (there is only one!)
}
