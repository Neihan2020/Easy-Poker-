/**
 * @auther LiuWeirui
 * @date 2022/2/24 16:21
 */
public class PokerUtil {
    String [] colors = new String[]{"黑桃","红桃","梅花","方块"};
    String [] point = new String[]{"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
    int [] colorsNum = new int[]{60,50,40,30};
    int [] pointNum = new int[]{14,13,12,11,10,9,8,7,6,5,4,3,2};
    //字符转换数字

    /*
     *   匹配操作
     *   匹配字符型参数对应数值型参数的所在数组的位置，并返回到匹配的这个值
     *   state：1匹配颜色，2匹配数字
     * */
    public int 匹配(String [] str1,Poker p,int state){
        int js =0;
        if(1==state){
            for(int i=0;i<str1.length;i++){
                if(str1[i].equals(p.getColor())){
                    js = i;
                    break;
                }
            }
        }else if(2==state){
            for(int i=0;i<str1.length;i++){
                if(str1[i].equals(p.getPoint())){
                    js = i;
                    break;
                }
            }
        }
        return js;
    }
}
