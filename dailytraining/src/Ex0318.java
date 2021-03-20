import java.util.ArrayList;
import java.util.List;

/**
 *
 写一个程序，输出从 1 到 n 数字的字符串表示。

 1. 如果 n 是3的倍数，输出“Fizz”；

 2. 如果 n 是5的倍数，输出“Buzz”；

 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 */
public class Ex0318 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            //先判断能不能同时被3和5整除，然后分别判断3和5，最后正常输出数字
            boolean divisibleBy3 = (i % 3) == 0;
            boolean divisibleBy5 = (i % 5) == 0;

            if(divisibleBy3 && divisibleBy5){
                answer.add("FizzBuzz");
            }else if (divisibleBy3){
                answer.add("Fizz");
            }else if (divisibleBy5){
                answer.add("Buzz");
            }else {
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }
}
