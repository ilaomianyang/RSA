package RSA算法;

public class RSAM {
    public static void main(String[] args) {
        int k = 0;
        int d = 0;
        int e = 2;
        int p = 2, q = 2;
        int n = 0;
        for(;p!=0; p++){
            for(;q!=0; q++){
                if(HZ.HZ(p,q)&&p!=q)
                    break;
            }
            if(HZ.HZ(p,q)&&p!=q)
                break;
        }
        n=p*q;
        int max=100,min=1;
        for(;;) {
            e = (int) (Math.random()*(max-min)+min);
            if(HZ.HZ(e,Oula.OulaS(p*q))) {
                k = (int) (Math.random() * (max - min) + min);
                d = (k * (int) Oula.OulaS(p * q) + 1) / e;
                if(d%1==0)
                    break;
            }
        }
        System.out.println("n="+n+","+"e="+e+","+"d="+d+","+"p="+p+","+"q="+q+","+"k="+k+","+"Oula(p*q=n)="+Oula.OulaS(n));
    }
}
