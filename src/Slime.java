public class Slime extends Enemy
{
    boolean jump;
    public Slime(String name, int might, boolean isHostile, boolean jump)
    {
        super(name, might, isHostile);
        this.jump = jump;
    }// end full constructor

    public Slime()
    {
        super();
        jump = true;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\n\tJump = " + jump;
    } // end toString (there is only one!)
}
