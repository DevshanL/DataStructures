import java.util.Scanner;
public class UseInp {

    public static void main(String[] args) {
        int[] arr = new int[5];

        int size = 5;

        Scanner UserIn = new Scanner(System.in);


        for(int j = 0; j<size; j++){
            arr[j] = UserIn.nextInt();

        }
        for(int i =0;  i<size; i++){
            System.out.println(arr[i]);
        }
    }

}
