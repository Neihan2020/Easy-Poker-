import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @auther LiuWeirui
 * @date 2022/2/24 15:22
 */
public class Test {
    public static void main(String[] args) {
        //创建两个玩家
        Player p1 = new Player(1,"张三",new ArrayList<Poker>());
        Player p2 = new Player(1,"李四",new ArrayList<Poker>());
        PokerService pokerService = new PokerServiceImpl();
        //发牌
        for(int i=0;i<2;i++){
            if(!pokerService.fapai(new Player[]{p1,p2})){
                System.out.println("发牌失败,未知错误程序结束!");
            }
        }
        System.out.println("发牌成功!");
        //显示
        System.out.println("玩家信息:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        //输出比较信息
        pokerService.bijiao(new Player[]{p1,p2});
    }
}
