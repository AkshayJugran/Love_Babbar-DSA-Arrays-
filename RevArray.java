import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class RevArray{
    public static void main(String args[]) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int size=Integer.parseInt(br.readLine());
        int[] array = new int[size];
        String lines= br.readLine();
        String[] str=lines.trim().split("\\s+");
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        funcRev(array);
        listRev(array);
    }

    public static void funcRev(int arr[])
    {
        System.out.println("output");
        for(int i=arr.length-1;i>=0;i--)
        {
        System.out.println(arr[i]);
        }
    }

    public static void listRev(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Using arrayList");
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }
        Collections.reverse(al);
        System.out.println(al);
    } 
}