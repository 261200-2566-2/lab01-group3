import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> result = sortTheArray(n);
        for(int i=0 ;i<n;i++){
            System.out.println(result.get(i)+" ");
        }
    }
    public static ArrayList<Integer> sortTheArray(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            Scanner s1 = new Scanner(System.in);
            int x = s1.nextInt();
            arr.add(x);
        }
        Collections.sort(arr);
        return arr;
    }
}