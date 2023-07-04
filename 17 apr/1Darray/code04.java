public class code04{
    public static void main(String[] args) {
    

        int a[]={34,21,54,65,43};
        int mx=Integer.MIN_VALUE;
        int sc=Integer.MIN_VALUE;
        for (int i : a) {
            mx=Math.max(i,mx);
        }
        for (int i : a) {
            if(i != mx){
            sc=Math.max(i,sc);
            }
        }
        System.out.println(sc);
    }
}