package RSA算法;

public class sec {
    public static void main(String[] args) {
        int m=3;
        int e=7,d=3,n=20;
        double ensec=Math.pow((double) m,(double) e)%n;
        System.out.println("ensec="+ensec);
        double desec=Math.pow(ensec,(double) d)%n;
        System.out.println("desec="+desec);
    }
}
