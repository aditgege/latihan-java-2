package sunwell.entity;

import javax.persistence.*;

@Entity
@Table(name="gamechild")
@IdClass(GameChildId.class)
public class GameChild
{
    @Id
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game_id;

    @Id
    private String name;
//      @EmbeddedId
//      private GameChildId gameChildId;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "game_id")
//    private Game game;

    @Column
    private String memo;

    public GameChild()
    {
    }

    public GameChild(String name, String ket, Game g)
    {
//        gameChildId = new GameChildId();
//        gameChildId.setGame_id(g.getId());
//        gameChildId.setName(name);

        this.game_id = g;
        this.name = name;
        this.memo = ket;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
}
