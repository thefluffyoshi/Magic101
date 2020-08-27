public class Slime extends Enemy
{
    int jump;
    static int slimecount = 0;
    String color;

    public Slime(String name, int might, boolean isHostile, int jump, String color)
    {
        super(name, might, isHostile);
        this.jump = jump;
        this.color = color;
        slimecount++;
    }// end full constructor

    public Slime()
    {
        super();
        jump = 1;
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

    public String jumpMeter()
    {
        if (jump < 5)
        {
            return "Not a threat, just a friend";
        }
        else if(jump >= 5 && jump < 15)
        {
            return "A little scary, don't get crushed";
        }
        else //(jump > 20);
        {
            return "You'll be crushed, don't risk it!";
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
