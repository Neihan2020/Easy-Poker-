import java.util.ArrayList;
import java.util.List;

/**
 * @auther LiuWeirui
 * @date 2022/2/24 15:13
 */
public class PokerParam {
    /*
    *   大小规则
    *       花色
    *           黑桃>红桃>梅花>方块
    *       点数
    *           A>K>Q>J>10>9>8>7>6>5>4>3>2
    * */
    public static List<Poker> pokerList;
    static {
        pokerList = new ArrayList<Poker>();
        String [] colors = new String[]{"黑桃","红桃","梅花","方块"};
        String [] point = new String[]{"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<point.length;j++){
                pokerList.add(new Poker(colors[i],point[j]));
            }
        }
    }
}
