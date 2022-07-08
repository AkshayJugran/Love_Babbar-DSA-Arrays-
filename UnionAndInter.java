import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UnionAndInter {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int size1=Integer.parseInt(br.readLine());
        int size2=Integer.parseInt(br.readLine());
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        String lines1= br.readLine();
        String lines2= br.readLine();
        String[] str1=lines1.trim().split("\\s+");
        String[] str2=lines2.trim().split("\\s+");
        for (int i = 0; i < str1.length; i++) {
            array1[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < str2.length; i++) {
            array2[i] = Integer.parseInt(str2[i]);
        }

        printUnion(array1 , size1 , array2 , size2);
    }

    private static void printUnion(int[] array1, int size1, int[] array2, int size2) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
            for(int i=0;i<size1;i++)
            {
                mp.put(array1[i], i);
            }
            for(int i=0;i<size2;i++)
            {
                mp.put(array2[i], i);
            }

            for(Map.Entry<Integer,Integer> mapElement :mp.entrySet())
            {
                System.out.println(mapElement.getKey()+" ");
            }
    }    
}
