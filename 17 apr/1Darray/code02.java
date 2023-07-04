public class code02.java{
     public static void main(String[]aargs) {
        int a[]={34,21,54,65,43};
        int sum=0;
        for (int i : a) {
            if(i%2==0){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}