import java.util.ArrayList;
import java.util.Collections;

/**
 * @auther LiuWeirui
 * @date 2022/2/24 15:35
 */
public class PokerServiceImpl implements PokerService {
    @Override
    public void shuffle() {
        Collections.shuffle(PokerParam.pokerList);
    }

    @Override
    public boolean fapai(Player [] players) {
        shuffle();
        for (int i=0;i<players.length;i++){
            if(!players[i].getPokerList().add(PokerParam.pokerList.get(i))){
                return false;
            }
        }
        return true;
    }

    /*
     *   大小规则
     *       花色
     *           黑桃>红桃>梅花>方块
     *       点数
     *           A>K>Q>J>10>9>8>7>6>5>4>3>2
     * */
    @Override
    public void bijiao(Player [] players) {
        for(int i=0;i<players.length;i++){
            Collections.sort(players[i].getPokerList());
        }
        ArrayList<Poker> playerArrayList = new ArrayList<Poker>();

        //获取最大的点数
        playerArrayList.add(players[0].getPokerList().get(players[0].getPokerList().size()-1));
        playerArrayList.add(players[1].getPokerList().get(players[1].getPokerList().size()-1));
        //两个玩家最大的点数
        for (int i=0;i<playerArrayList.size();i++){
            System.out.println("玩家"+(i+1)+"最大的牌:"+playerArrayList.get(i));
        }
        Collections.sort(playerArrayList);
        System.out.println("其中最大的牌是:"+playerArrayList.get(playerArrayList.size()-1));
    }
}
