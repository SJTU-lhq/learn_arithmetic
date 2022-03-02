package lhq.train.Offer11;

public class Test {
    public int minArray(int[] numbers) {
        if(numbers == null || numbers.length == 0){
            return -1;
        }
        if(numbers.length == 1){
            return numbers[0];
        }
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numbers[i - 1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
