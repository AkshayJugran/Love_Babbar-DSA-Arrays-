import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort01Arr {
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
        sort(array);
    }

    public static void sort(int[] arr){
        int i ,cnt0=0,cnt1=0,cnt2=0;
        for(i=0;i<arr.length;i++)
        {
            switch(arr[i]){
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i=0;
        while(cnt0>0){
            arr[i++]=0;
            cnt0--;
        }
        while(cnt1>0)
        {
            arr[i++]=1;
            cnt1--;
        }
        while(cnt2>0)
        {
            arr[i++]=2;
            cnt2--;
        }

        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
