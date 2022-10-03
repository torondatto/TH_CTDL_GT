public class Ex1 {
    //cau a
    public static int caua(int num){
        int result = 1;
        for(int i=1;i<=num;i++){
            result *= i;
        }
        return result;
    }
    public static int caub(int x, int num){
        int result = 1;
        while(num>0){
            result *= x;
            num--;
        }
        return result;
    }
    public static int cauc(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static boolean caud(int n) {
        if(n < 2) {
            return false;
        } else {
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int caue(int a, int b) {
        int rem;
        while(b > 0) {
            rem = a % b;
            a = b;
            b = rem;
        } 
        return a;
    }
}