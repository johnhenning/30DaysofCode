import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(n," ![,?.\\_'@+]");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
        }
    }
}
