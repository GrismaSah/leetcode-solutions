public class DigitExtraction {
    public static void main(String[] args) {
        int n = 12345;
        // loop runs until number becomes 0
        while(n > 0) {
            // extract last digit
            int lastDigit = n % 10;
            // print extracted digit
            System.out.println(lastDigit);
            // remove last digit from number
            n = n / 10;
        }
    }
}
