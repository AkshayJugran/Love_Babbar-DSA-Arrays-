import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int size=Integer.parseInt(br.readLine());
        int[] array = new int[size];
        String line = br.readLine();
        String[] str = line.trim().split("\\s+");
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        manualMaxMin(array);
        arrList(array);
    }

    public static void manualMaxMin(int[] arr)
    {
        int min=arr[0];
        int max=arr[arr.length-1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Using Loops");
        System.out.println(max + " " + min);
    }

    public static void arrList(int[] arr)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        System.out.println("Using ArrayList");
        System.out.println(Collections.min(al) + " "+Collections.max(al));
    }
}
