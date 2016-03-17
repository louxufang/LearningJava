package chapter1.Xiti;

/**
 * Created by zhiyo on 2016/3/12.
 */
public class Equation {
    public static void main(String[] args) {

        double[][] f = {{3.4,50.2,44.5},{2.1,0.55,5.9}};
        double fenmu = f[0][0] * f[1][1] - f[0][1] * f[1][0];
        double x1 = f[0][2] * f[1][1] -f[0][1] * f[1][2];
        double y1 =f[0][0] * f[1][2] - f[0][2] * f[1][0];
        double x = x1 / fenmu;
        double y = y1 / fenmu;
        System.out.println(x);
        System.out.println(y);

    }
}
