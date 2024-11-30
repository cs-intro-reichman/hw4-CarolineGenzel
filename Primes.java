public class Primes {
    public static void main(String[] args) {
        final int N=Integer.parseInt(args[0]);
        boolean [] checkArr= new boolean[N+1];
        for(int i=0;i<=N;i++){
            if(i==0 || i==1) {
                checkArr[i]=false;
            }
            else checkArr[i]=true;
        }
       
        int p=2;
        int count=0;
        while (p < Math.sqrt(N)) {
            while (count<N) {
                if (checkArr[count] && p!=count && count%p==0) {
                    checkArr[count]=false;
                }
                count++;
            }
            p++;
            count=p;
        }
    double numP=0.0;
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");

    for(int i=0;i<N;i++){
        if (checkArr[i]) {
            System.out.println(i);
            numP++;

        }
    }
    double odd= numP/N;
    System.out.println("there are "+ (int)numP+ " primes between 2 and "+ N+" ("+(int)(odd*100)+"% are primes)");

}}