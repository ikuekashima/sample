
public class clock {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int seconds = getSeconds(18, 32, 47);
        System.out.println(seconds);
    }
    /*getSecondsという名前のメソッドを作成　時・分・秒を引数で受け取ると
    1日の中での経過秒数を計算する
    h 60秒×60　3600分　1ｈ
    m　60分　+　seconds 秒
    */
    public static int getSeconds(int h, int m, int s) {
        int result = h * 3600 + m * 60 + s;
        return result;
    }
}
