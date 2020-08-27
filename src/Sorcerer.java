public class Sorcerer
{
    int health;
    String name;
    double mana;
    String type;

    public Sorcerer(String name, int health, double mana, String type)
    {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.type = type;
    }

    public Sorcerer()
    {
        name = "null";
        health = 50;
        mana = 35.0;
        type = "fire";
    }

    //getters
    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public double getMana()
    {
        return mana;
    }

    //setters
    public void setHealth(int health)
    {
        this.health = health;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setMana(double mana)
    {
        this.mana = mana;
    }

    public String typeDamage()
    {
        if (type.equalsIgnoreCase("fire"))
        {
            return "Avoid any water enemies";
        }
        else if (type.equalsIgnoreCase("ice"))
        {
            return "Avoid any fire enemies";
        }
        else //other types
        {
            return "Figure it out yourself, sorry!";
        }
    }

    public String toString() {
        return "\nThe Sorcerer currently has: " +
                "\n\tName: " + name +
                "\n\tHealth: " + health +
                "\n\tMana: " + mana;
    } // end toString (there is only one!)

}
