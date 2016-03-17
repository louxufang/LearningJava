package chapter1.Xiti;

/**
 * Created by zhiyo on 2016/3/12.
 */
public class A0104 {
    public static void main(String[] args) {
        System.out.println("a  a^2  a^3");
        String s = "  ";
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + s + (i * i) + s + (i * i * i));
//        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-4d%-4d%-4d", i, i * i, i * i * i);
            System.out.println();
        }
    }
}
