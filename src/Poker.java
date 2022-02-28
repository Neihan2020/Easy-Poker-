import java.util.Collection;

/**
 * @auther LiuWeirui
 * @date 2022/2/24 15:08
 */
public class Poker implements Comparable<Poker> {
    //花色
    private String color;
    //点数
    private String point;

    @Override
    public int compareTo(Poker o) {
        PokerUtil pu = new PokerUtil();
        //匹配颜色
        int thisColorNum = pu.colorsNum[pu.匹配(pu.colors,this,1)];
        int oColorNum = pu.colorsNum[pu.匹配(pu.colors,o,1)];

        //匹配点数
        int thisPointNum = pu.pointNum[pu.匹配(pu.point,this,2)];
        int oPointNum = pu.pointNum[pu.匹配(pu.point,o,2)];
        return thisPointNum>oPointNum?1:thisPointNum==oPointNum?(thisColorNum>oColorNum?1:thisColorNum==oColorNum?0:-1):-1;
    }



    @Override
    public String toString() {
        return "Poker{" +
                "color='" + color + '\'' +
                ", point='" + point + '\'' +
                '}';
    }

    public Poker() {
    }

    public Poker(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }


}
