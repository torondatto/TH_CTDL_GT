public class Ex4 {
    public static int caua(int n) {
        if(n == 1) {
            return 3;
        } else {
            return (2*n+1) + caua(n -1) ;
        }
    }

    public static int factorial(int n) {
        if(n < 2) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static int caub(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n) + caub(n - 1);
    }

    public static int cauc(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n) * cauc(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(caua(1));
        System.out.println(caua(2));
        System.out.println(caua(3));
        System.out.println(caub(1));
        System.out.println(caub(2));
        System.out.println(caub(3));        
        System.out.println(cauc(1));
        System.out.println(cauc(3));
    }
}
