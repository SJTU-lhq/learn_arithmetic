package lhq.train.Question537;

public class Test {
    public static String complexNumberMultiply(String num1, String num2) {
        Integer num1Real = getReal(num1);
        Integer num2Real = getReal(num2);
        Integer num1Imag = getImag(num1);
        Integer num2Imag = getImag(num2);
        return "" + (num1Real*num2Real - num1Imag*num2Imag) + "+" + (num1Real*num2Imag + num2Real*num1Imag) + "i";
    }

    /**
     * 获取实部
     * @param num
     * @return
     */
    private static Integer getReal(String num){
        int index = num.indexOf("+");
        String substring = num.substring(0, index);
        return Integer.valueOf(substring);
    }

    /**
     * 获取虚部中的数字
     * @param num
     * @return
     */
    private static Integer getImag(String num){
        int index = num.indexOf("+");
        String substring = num.substring(index + 1, num.length() - 1);
        return Integer.valueOf(substring);
    }

    public static void main(String[] args) {

        //System.out.println(complexNumberMultiply("1+1i", "1+1i"));
        String[] ss1 = "1+1i".split("\\+|i"), ss2 = "1+1i".split("\\+|i");
    }
}
