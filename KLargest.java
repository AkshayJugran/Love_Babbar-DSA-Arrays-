import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KLargest {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int size=Integer.parseInt(br.readLine());
        int element=Integer.parseInt(br.readLine());
        int[] array = new int[size];
        String line = br.readLine();
        String[] str = line.trim().split("\\s+");
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        int ans = kthLargest(array,element);
        System.out.println(ans);
    }

    public static int kthLargest(int arr[] , int el){
        int largest=0;
        Arrays.sort(arr);
        largest=arr[arr.length-el];
        return largest;
    }
}
