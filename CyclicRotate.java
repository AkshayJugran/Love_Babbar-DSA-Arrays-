import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CyclicRotate {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int size=Integer.parseInt(br.readLine());
        int[] array = new int[size];
        String line = br.readLine();
        String[] str = line.trim().split("\\s+");
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        Rotate(array,size);
        ListRotate(array,size);
    }

    private static void ListRotate(int[] array, int size) {
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            al.add(array[i]);
        }
        Collections.rotate(al,0);
        System.out.println("Using array list");
        System.out.println(al);
    }

    private static void Rotate(int[] array, int size) {
        int last=size-1,first=0;
        int temp;
        temp=array[last];
        array[last]=array[first];
        array[first]=temp;
        first++;

        PrintRotate(array,first,last);
    }

    private static void PrintRotate(int[] array, int first, int last) {
        
        while(first<last){
            int temp=array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
        }
        System.out.println("Cyclic Array ");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
