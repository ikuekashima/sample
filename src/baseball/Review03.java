package baseball;
/*メインメソッドの中で BaseBallTeam のインスタンスを6個生成し、それぞれのチームの名前、勝ち数、負け数、引き分け数を格納してください
report メソッドを呼び出して、勝敗情報を表示してください

*/
public class Review03 {

     public static void main(String[] args) {

         BaseBallTeam team1 = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
         team1.report();

         BaseBallTeam team2 = new BaseBallTeam("阪神タイガース",73,68,2);
         team2.report();

         BaseBallTeam team3 = new BaseBallTeam("読売ジャイアンツ",68,71,4);
         team3.report();

         BaseBallTeam team4 = new BaseBallTeam("広島東洋カーブ",66,74,3);
         team4.report();

         BaseBallTeam team5 = new BaseBallTeam("中日ドラゴンズ",66,75,2);
         team5.report();
}
}


