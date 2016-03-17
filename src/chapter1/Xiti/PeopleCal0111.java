package chapter1.Xiti;

/**
 * Created by zhiyo on 2016/3/12.
 */
public class PeopleCal0111 {
    long time = 356 * 5 * 24 * 60 * 60;
    long birth = time / 7;
    long death = time / 13;
    long migrate = time / 45;
    long now = 312032486;
    long totle = now + birth - death + migrate;
    public PeopleCal0111(){
        System.out.println(totle);
    }
    public static void main(String[] args) {
        new PeopleCal0111();
    }
}
