package baseball;

/*それぞれのフィールドに値が設定できるようにします
勝率はフィールドとして持たせず、メソッドにします。「勝ち数/(勝ち数+負け数)」の
計算で求められるからです。この計算結果を小数値（double）で戻す
getRate メソッドを BaseBallTeam に作ってください
もうひとつ、 report というメソッドを BaseBallTeam に作ります。
○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。
と表示するメソッドです
この実行例では、読みやすくなるよう適当にスペースを入れています
チーム名／勝数／負け数／引き分け数は、以下のどちらかの方法で
参照してください：
自クラス内のフィールドを直接参照する方法
getterメソッドを用いて値を参照する方法
※いずれにしても勝率はgetRateメソッドを用いて値を取得してください
*/
public class BaseBallTeam {
    // フィールド
    public String name;
    public int win;
    public int lose;
    public int draw;

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
        System.out.println("インスタンス化時にコンストラクタが呼ばれました");
        name = "未設定です";
        win = 0;
        lose = 0;
        draw = 0;
    }

    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率はフィールドとして持たせず、メソッドにする「勝ち数/(勝ち数+負け数)」

      public double getRate() {
          double rate = (double)win / (win + lose);
          return rate;
      }


    // もうひとつ、 report というメソッドを BaseBallTeam に作ります。
    /*
     * ○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。 と表示するメソッドです
     */
    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose +"敗" +this.draw +"分、勝率は"+this.getRate()+"です。");
    }
}
