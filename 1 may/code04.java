public class code04{
        public class int sumOfValuesInArray(int[]a,int idx){
        int sum=0;
        if(idx<a.length){
            return idx;
        }
        sum=a[idx]+sumOfValuesInArray(int[]a,int idx+1)

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
    int[]a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
   System.out.println("sum of vlaues: "+ sumOfValuesInArray(a,0));
    }
}