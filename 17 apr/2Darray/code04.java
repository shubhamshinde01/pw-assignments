public class code04{
    public static void main(String[ ]args){
    
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of rows : ");
    m=sc.nextInt();    
    System.out.print("enter the number of column : ");    
    n=sc.nextInt();
    int arr[][]=new int[m][n];
    
    int i,j;   
    int mx=Integer.MIN_VALUE; 
       
    System.out.println("enter the  matrix element : ");    
    for(i=0;i<m;i++){    
        for(j=0;j<n;j++){    
            arr[i][j]=sc.nextInt();  
        }    
    }     

    for(i=0;i<m;i++){    
        for(j=0;j<n;j++){
            mx=Math.max(mx,a[i][j]);            
        }
    }
         system.out.println(mx);
    }
}