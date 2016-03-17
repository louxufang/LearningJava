package chapter1;

import java.util.Arrays;

/**
 * Created by zhiyo on 2016/3/12.
 */
public class Welcome {
    public static void main(String[] args){
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
    }
}
