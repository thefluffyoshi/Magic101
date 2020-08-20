public class Dragon extends Enemy{
    //instance variables
    boolean hasFire;
    double wingspan;

    //constructors
    public Dragon(String name, int might, boolean isHostile, boolean hasFire, double wingspan)
    {
        super(name, might, isHostile);
        this.hasFire = hasFire;
        this.wingspan = validateWingspan(wingspan);
    }// end full constructor

    public Dragon()
    {
        super();
        hasFire = false;
        this.wingspan = 0;
    }//end null constructor

    //getters
    public String getName()
    {
        return name;
    }//end getDragonName

    public int getMight()
    {
        return might;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
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

    public void setMight(int might)
    {
        this.might = might;
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
