import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TugasBubblesort {
    public static void main(String[] args) throws IOException {
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
        // Class Buffered menjadi variabel baru bernama kata
        int a;
        System.out.println("Jumlah Nama Yang Di Inputkan : ");
        a = Integer.parseInt(kata.readLine());

        String[] Array;
        Array = new String[a];
        String temp;
        Scanner input = new Scanner(System.in);

        // penginputan nama
        for(int i=0;i<a;i++)
        {
            System.out.print("Nama " +(i+1)+" adalah : ");
            Array[i]=input.next();
        }
        // proses penyortingan
        for(int x=1;x<a;x++)
        {
            for(int y=0;y<a-x;y++)
            {
                if(Array[y].compareTo(Array[y+1])>0)
                {
                    temp=Array[y];
                    Array[y]=Array[y+1];
                    Array[y+1]=temp;
                }
            }
        }
        // output pengurutan nama
        for (String s : Arrays.asList("", "Urutannya : ")) {
            System.out.println(s);
        }

        for(int i=0;i<a;i++){
            System.out.println((i+1)+". "+ Array[i]);
        }
        // output dari jumlah siswa
        System.out.println("Jumlah siswa : " + a);
        System.out.println("nama 2 terbawah : " + Array[a-2]);
        System.out.println("nama 2 teratas : " + Array[1]);

    }
}


