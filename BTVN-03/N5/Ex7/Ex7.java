import java.util.Scanner;

public class Ex7 {
    public static int findMin(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }
        return Math.min(array[index], findMin(array, index + 1));
    }

    public static int sum(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }
        return array[index] + sum(array, index + 1);
    }

    public static int countEven(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        int result;
        if (array[index] % 2 == 0) {
            result = 1;
        } else {
            result = 0;
        }
        return result + countEven(array, index + 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity element of array: ");
        int n= sc.nextInt();
        int[] array = new int[n] ;
        for(int i=0 ;i<n;i++){
             System.out.print("Enter element " + i +": ");
             array[i] = sc.nextInt();
        } 
        System.out.println(findMin(array,0));
        System.out.println(sum(array,0));
        System.out.println(countEven(array,0));
        sc.close();
   }
}
