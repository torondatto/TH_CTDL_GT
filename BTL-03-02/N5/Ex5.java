import java.util.Scanner;;

public class Ex5 {
    public static String convertEx(int number, int base) {
        if(number ==0) return "";
        return convertEx(number/base, base) + String.valueOf(number%base);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int base = input.nextInt();
        System.out.println(convertEx(number, base));  
        input.close();
    }
}
