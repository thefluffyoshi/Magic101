public class Slime extends Enemy
{
    boolean jump;
    static int slimecount = 0;
    String color;

    public Slime(String name, int might, boolean isHostile, boolean jump, String color)
    {
        super(name, might, isHostile);
        this.jump = jump;
        this.color = color;
        slimecount++;
    }// end full constructor

    public Slime()
    {
        super();
        jump = false;
        color = "transparent";
        slimecount++;
    }

    public String compareColor()
    {
        if (color.equalsIgnoreCase("transparent"))
        {
            return "You are unable to see it";
        }
        else if (color.equalsIgnoreCase("green"))
        {
            return "You see a green buddy";
        }
        else //other colors!
        {
            return "Good luck with that";
        }
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tJump = " + jump +
                "\n\tColor = " + color;
    } // end toString (there is only one!)
}
