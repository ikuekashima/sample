
public class Review01 {

    public static void main(String[] args) {

        // **円の商品の税込価格は*円（消費税は**円）です。
        int price = 1500;
        double tax = 0.1;
        double result;
        result =  tax(price, tax);
        double priceintax = result+price;
        //税込＝result(1500*0.1=150)　+1500円
        System.out.println(price+"円の商品の税込価格は"+(int) priceintax+"円（消費税は"+(int)result+"円）です。");
    }



    public static double tax(double price, double tax) {

        double result = price * tax;
        return result;


/* メンターより学んだこと！
  mainメソッド内に出力命令を入力すること　System---
  taxメソッドに税の掛け算を入力する　1500円×10％をする　1500はpriceに入れておく＝引数という
   戻り値に関しては、taxメソッドの直前のdoubleで戻り値あり　無しの場合はvoid
 */
    }

}
