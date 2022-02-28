import java.util.ArrayList;
import java.util.List;

/**
 * @auther LiuWeirui
 * @date 2022/2/24 15:25
 */
public class Player {
    //玩家至少要有ID，姓名，手牌等属性
    private int id;
    private String name;
    private List<Poker> pokerList;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pokerList=" + pokerList +
                '}';
    }

    public Player() {
        pokerList = new ArrayList<Poker>();
    }

    public Player(int id, String name, List<Poker> pokerList) {
        this.id = id;
        this.name = name;
        this.pokerList = pokerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Poker> getPokerList() {
        return pokerList;
    }

    public void setPokerList(List<Poker> pokerList) {
        this.pokerList = pokerList;
    }
}
