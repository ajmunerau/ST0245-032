import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ejecutar {

    public static void main (String [] args) {
        try {
            FileReader f  = new FileReader("Nodo.txt");
            BufferedReader br = new BufferedReader(f);
            String line = br.readLine();
            while(line != null) {
                int len1 = Integer.parseInt(line);
                int array[][] = new int[len1][len1];
                int len2 = Integer.parseInt(br.readLine());

                for (int i = 0; i < len2; i++) {
                    line = br.readLine();
                    String[] con = line.split(" ");
                    int num1 = Integer.parseInt(con[0]);
                    int num2 = Integer.parseInt(con[1]);
                    array[num1][num2] = 1;
                }
                if (Bicolorable(array, 0, len1)) System.out.println("BICOLORABLE");
                else System.out.println("NOT BICOLORABLE");
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Make sure ''Nodo.txt'' exists.");
        }
    }

    public static boolean Bicolorable(int array[][], int n, int len) {
        int [] colors = new int[len];
        for (int i = 0; i < len; i++) colors[i] = -1;
        colors [n] = 1;
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(n);
        while (list.size() != 0) {
            int x = list.poll();
            if (array[x][x] == 1) return false;
            for (int i = 0; i < len; i++) {
                if (array[x][i] == 1 && colors[i] == -1) {
                    colors[i] = 1 - colors[x];
                    list.add(i);
                }
                else if (array[x][i] == 1 && colors[i] == colors[x]) return false;
            }
        }
        return true;
    }

}
