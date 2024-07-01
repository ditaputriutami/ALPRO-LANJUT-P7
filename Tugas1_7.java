public class Tugas1_7 {
    public static void main(String[] args) {
       int n=4;
       int j=0;
       int k=0;
       for(int i=1;i<=n;i++){
		   j++;
		   k +=i;
		   System.out.print(" "+i+" " );
		   if(j==2){
			   System.out.print(k);
			   j=0;
			   k=0;
		   }
	   }
   }
}