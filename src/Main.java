import java.util.* ;
public class Main {

    public static void main(String[] args) {
        //英哩轉公里
        Scanner in=new Scanner(System.in);
        int x;
        double y;
        double z = 1.6;
        x=in.nextInt();
        y=x*z;
        System.out.printf("%.1f\n",y);


    }
}