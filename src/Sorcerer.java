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

    public String getType()
    {
        return type;
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

    public void setType(String type)
    {
        this.type = type;
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

    public int heal()
    {
        if (health < 25)
        {
            return health = 35;
        }
        else
        {
            return health;
        }
    }

    public double manaSpent(int health)
    {
        if (health < 25)
        {
            return mana = mana - 10;
        }
        else if (health >= 25 && health < 50)
        {
            return mana = mana + 15;
        }
        else
        {
            return mana;
        }
    }

    public String toString() {
        return "\nThe Sorcerer currently has: " +
                "\n\tName: " + name +
                "\n\tHealth: " + health +
                "\n\tMana: " + mana;
    } // end toString (there is only one!)

}
