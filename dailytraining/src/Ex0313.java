/**
 * 你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：
 *
 * 你写出一个秘密数字，并请朋友猜这个数字是多少。
 * 朋友每猜测一次，你就会给他一个提示，告诉他的猜测数字中有多少位属于数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位属于数字猜对了但是位置不对（称为“Cows”, 奶牛）。
 * 朋友根据提示继续猜，直到猜出秘密数字。
 * 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，返回字符串的格式为 xAyB ，x 和 y 都是数字，A 表示公牛，用 B 表示奶牛。
 *
 * xA 表示有 x 位数字出现在秘密数字中，且位置都与秘密数字一致。
 * yB 表示有 y 位数字出现在秘密数字中，但位置与秘密数字不一致。
 * 请注意秘密数字和朋友的猜测数都可能含有重复数字，每位数字只能统计一次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bulls-and-cows
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Ex0313 {
    public static String getHint(String secret, String guess) {
        //需要记录两个数，一个是位置和值都相同的公牛数
        int A = 0;
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)){
                A++;
            }
        }

        /*
            另外是值相同但是位置不同的奶牛数B
            思路是两个字符串中，同一个字符相同的数量是出现该字符较少的字符串里出现的次数决定
         */
        //因为只有数字0-9，那么用数组来记录，坐标表示字符，数组的值表示出现次数
        int B = 0;
        int[] secretNum = new int[10];
        int[] guessNum = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            secretNum[secret.charAt(i) - '0'] ++;
        }
        for (int i = 0; i < guess.length(); i++) {
            guessNum[guess.charAt(i) - '0'] ++;
        }
        for (int i = 0; i < 10; i++) {
            B += Math.min(secretNum[i], guessNum[i]);
        }

        //所有的重复的再除去之前相同位置的个数，就是奶牛数目
        return A + "A" + (B - A) + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810"));
    }
}
