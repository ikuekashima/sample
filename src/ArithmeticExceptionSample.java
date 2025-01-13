
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // int型10をint型0で除算
        int a = 10 / 0; //ここで例外が発生！

        //この下の出力は実行されない

        System.out.println(a);
//ArithmeticExceptionエラーは0で割り算できないという意味
    }

}
