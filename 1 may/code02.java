public class code02{
     public static int alternateSign(int n) {
    int result=0;
    if(n%2==0){
        result=-(n/2);
    }
    else{
        result=(n+1)/2;
    }
    return result;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        System.out.println("sum of dighits in " + n+":"+ alternateSign(n));

    }
}