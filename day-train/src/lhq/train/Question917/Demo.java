package lhq.train.Question917;

public class Demo {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (true){
            if(left >= right){
                break;
            }
            if(! Character.isLetter(charArray[left])){
                left ++;
                continue;
            }
            if(! Character.isLetter(charArray[right])){
                right --;
                continue;
            }
            char index = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = index;
            left ++;
            right --;
        }
        return new String(charArray);
    }
}
