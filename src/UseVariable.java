
public class UseVariable {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int number1;
        String str1;
        //変数の宣言　型にはめて宣言　変数の名前をそのあとに入力
        //現在は中身が空っぽである
        number1 = 1;
        str1 = "abc";
        //代入をする
        //１行にまとめる方法もある int number1 = 1;
        //変数名は数字から始める1abcはできない　-　も不可。
        System.out.println(number1);
        System.out.println(str1);
        int number2 = 100;
        String str2 = "xyz";
        System.out.println(number2);
        System.out.println(str2);

        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinutes = 60;
        int secondPerDay = hoursPerDay * minutesPerHour * secondsPerMinutes;

        //２言語目以降の先頭文字を大文字にする　キャメルケース

        //上書きする際は、文字列から数値は不可
        System.out.println(secondPerDay);

        //少数型　doubleを使用
        //char は文字型　シングルクォーテーションで囲む

        //stringは参照型　同じ文字列が入れば、変数名が異なっても同じ文字列となる
    }

}
