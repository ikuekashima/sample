
public class Review02 {

    public static void main(String[] args) {
        /* 1から100までの連続した整数を画面に表示する。
         ただし、下記の条件にしたがうこと：

        ・もし、その整数が3で割り切れる数なら "Fizz" と表示する
        ・もし、その整数が5で割り切れる数なら "Buzz" と表示する
        ・上記2つの条件は同時に満たせる。つまり、もし、その整数が3で
        割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
        ・それ以外の数は、その数をそのまま表示する
        課題の提出
        */
        /*メンターより、脇でダブルクリックをし、デバック、実行でF6キーブレイクポイント使用
         できる方法がある
         */
        for (int i = 1; i <= 100; i++) {

            // i % 7 == 0 とは、7で割り切れる
            // ||もしくは　という意味
            if( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");


            } else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            } else if ( i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                   System.out.println(i);
            }
        }
    }
}




