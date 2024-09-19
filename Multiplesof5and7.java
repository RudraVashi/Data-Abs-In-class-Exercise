public class Multiplesof5and7{
    public static int sumOf(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

