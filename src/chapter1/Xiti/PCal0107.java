package chapter1.Xiti;

/**
 * Created by zhiyo on 2016/3/12.
 */
public class PCal0107 {
    public static void main(String[] args) {
        int i = -1;
        float sum = 0;
        for (int j = 1;j < 2002;j++,j++){
            i *= -1;
            sum += 1.0 /(j * i);
        }
        float p = 4 * sum;
        System.out.println(p);
    }
}
