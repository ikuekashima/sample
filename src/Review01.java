
public class Review01 {

    public static void main(String[] args) {
        // **円の商品の税込価格は*円（消費税は**円）です。
        int price = 1500;
        double tax = price*0.1;
        double pay =(price + tax);
        System.out.println(price+"円の商品の税込価格は"+pay+"円（消費税は"+tax+"円)です");



    }

}
