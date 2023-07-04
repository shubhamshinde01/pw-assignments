public class code05{
    public static void main (String [] args){
          
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of rows : ");
    m=sc.nextInt();    
    System.out.print("enter the number of column : ");    
    n=sc.nextInt();
    int arr[][]=new int[m][n];
    
    int i,j;   
   
       
    System.out.println("enter the  matrix element : ");    
    for(i=0;i<m;i++){    
        for(j=0;j<n;j++){    
            arr[i][j]=sc.nextInt();  
        }    
    }     

    for(i = 0 ; i < m ; i++)System.out.print(arr[i][m/2] + "  ");    
    for(j = 0 ; j < m ; j++){
       if(j == m/2)continue;
       System.out.print(arr[m/2][j] + "  ");
   }
    }
}