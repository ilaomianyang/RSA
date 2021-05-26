package RSA算法;

public class HZ {
    public static boolean HZ(long a,long b) {
        if(a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long c;
        while((c = a % b) != 0) {
            a = b;
            b = c;
        }
//        System.out.println(b == 1);//b == 1 表示互质
        return b == 1;
    }
}