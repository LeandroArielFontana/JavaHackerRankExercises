package JavaLoopsII;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int result;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            result = a;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= j; k++) {
                    result += (int)Math.pow(2, k) * b;
                }
                System.out.print(result + " ");
                result = a;
            }
            System.out.println();
        }
        in.close();
    }
}