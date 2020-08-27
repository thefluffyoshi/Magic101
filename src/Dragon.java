public class Dragon extends Enemy{
    //instance variables
    boolean hasFire;
    double wingspan;
    static int countDragons = 0;

    //constructors
    public Dragon(String name, int might, boolean isHostile, boolean hasFire, double wingspan)
    {
        super(name, might, isHostile);
        this.hasFire = hasFire;
        this.wingspan = validateWingspan(wingspan);
        countDragons++;
    }// end full constructor

    public Dragon()
    {
        super();
        hasFire = false;
        this.wingspan = 0;
        countDragons++;
    }//end null constructor

    //getters
    public boolean getHasFire()
    {
        return hasFire;
    }

    public double getWingspan()
    {
        return wingspan;
    }

    //setters
    public void setHasFire(boolean hasFire)
    {
        this.hasFire = hasFire;
    }

    public void setWingspan(double wingspan)
    {
        this.wingspan = wingspan;
    }

    public double validateWingspan (double wingspan)
    {
        while (wingspan < 0)   //check until wingspan is greater than equal to -1
        {
            System.out.println("There is no such thing as negative wings! Please try again");
            wingspan++; //make sure it works
        }

        return wingspan;
    }

    public String howStrong ()
    {
        if (might < 10)
        {
            return "You can handle it!";
        }
        else if (might >= 10 && might < 25)
        {
            return "You might struggle when you fight";
        }
        else
        {
            return "Run, not worth it!";
        }
    }


    //toString   this is the test output method
    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tHasFire = " + hasFire +
                "\n\twingspan = " + wingspan;
    } // end toString (there is only one!)
}
