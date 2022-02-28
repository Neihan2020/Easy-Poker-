/**
 * @auther LiuWeirui
 * @date 2022/2/24 15:29
 */
public interface PokerService {
    //打乱
    void shuffle();
    //发牌
    boolean fapai(Player [] players);
    //比较大小
    void bijiao(Player [] players);
}
