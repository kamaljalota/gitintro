public class Gcd {
    public static void main(String[] args) {
        int f=72;
        int s=120;
        int res=0;
        for (int i = 1; i <=f&&i<=s ; i++) {
            if (f%i==0&&s%i==0){
                res=i;
            }

        }
        System.out.println(res);
        int lcm=f*s/res;
        System.out.println(lcm);
    }
}
