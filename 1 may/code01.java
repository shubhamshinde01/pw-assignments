public class code01{
     public static int sumOfInt(int n) {
        int result=0;
        if(n==0){
            return 0;
        }
        else{
        result=(n%10)+sumOfInt(n/10);
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        System.out.println("sum of dighits in " + n+":"+ sumOfInt(n));

    }
}