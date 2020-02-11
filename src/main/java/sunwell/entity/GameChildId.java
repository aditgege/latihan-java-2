package sunwell.entity;

import java.io.Serializable;

public class GameChildId implements Serializable
{
    private int game_id;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGame_id()
    {
        return game_id;
    }

    public void setGame_id(int game_id)
    {
        this.game_id = game_id;
    }



    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + this.game_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        final GameChildId that = (GameChildId) obj;
        if (this.game_id != that.game_id)
            return false;

        if ((this.name == null) ? (that.name != null) : !this.name.equals(that.name))
            return false;

        return true;
    }


}
