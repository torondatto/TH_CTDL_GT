public class Ex2 {
    public  static int count = 0;
    // Caunumber1
    public static int factorial(int number) {
        if (number <= 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int powInt(int x, int number) {
        if(number < 0) {
            return x;
        }
        return powInt(x, number - 1)*x;
    }

    public static int countNumberOfDigits(int number) {
        if (number <= 0) {
            return count;
        }
        count++;
        return countNumberOfDigits(number/10);
    }

    public static int GCD(int number, int number1) {
        if(number1 == 0) {
            return number;
        } else {
            return GCD(number1, number % number1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(powInt(2, 7));
        System.out.println(countNumberOfDigits(123));
        System.out.println(GCD(8, 5));
    }
}
