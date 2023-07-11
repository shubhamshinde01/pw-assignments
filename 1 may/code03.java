public class code03{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
    int[]a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    int mx=Integer.MIN_VALUE;
    for (int i=0;i<a.length;i++) {
        mx=Math.max(a[i], a[i++]);
        
    }
        System.out.println(mx);

    }
}