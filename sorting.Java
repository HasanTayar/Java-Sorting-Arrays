import java.util.Scanner;
public class sorting{
    public static void main(String[]args){
        // selection sort:
        Scanner in =new Scanner (System.in);
	      int a[]=new int[10]; 
	      int i=0,j;
	      System.out.println("enter a min number:");
	      for( i=0;i<a.length;i++)
	    	  a[i]=in.nextInt();
	      for( i=0;i<a.length-1;i++){
	      int mInd=i;
	      for( j=i;j<a.length;i++){ 
	      if(a[j]<a[mInd])
	      mInd=j;
	      }
	       for( i=0;i<a.length;i++){
	    	  System.out.println(a[i]+" ");
	      }
		}
    // insertion sort:
	 Scanner in =new Scanner (System.in);
	      int a[]=new int[10]; 
	      int i=0,j,tmp;
	      System.out.println("enter a min number:");
	      for( i=0;i<a.length;i++)
	    	  a[i]=in.nextInt();
	      for( i=1;i<a.length;i++) {
	    	 int k = i;
	         tmp = a[i];
	         j=i-1;
	      while ( j >=0 && tmp < a[j]) 
	         {
	                a[j+1] = a[j]; 
	                 j--;
	      }
	      k = j+1;
        a[k] = tmp; 
	}
	      for( i=0;i<a.length;i++) {
	    	  System.out.println(a[i]+" ");
	      }
        // ##bubble sort:
	    Scanner in =new Scanner (System.in);
	      int a[]=new int[10]; 
	      int i=0,j,tmp;
	      System.out.println("enter a min number:");
	      for( i=0;i<a.length;i++)
	    	  a[i]=in.nextInt();
	      for( i=0;i<a.length;i++) {
	    	  for( j=0;j<a.length-i-1;j++) {
	    		 if(a[j]>a[j+1]) {
	    			 tmp=a[j];
	    			 a[j]=a[j+1];
	    			 a[j+1]=tmp;
	    		 }
	    	  }
	      }
	      for( i=0;i<a.length;i++) 
	    	  System.out.print(a[i]+" ");
        // counting sort:
            Scanner in =new Scanner (System.in);
	      int a[]=new int[10]; 
	      int i=0;
	      int max=a[0];
	      System.out.println("enter a min number:");
	      for( i=0;i<a.length;i++)
	    	  a[i]=in.nextInt();
	      for( i=0;i<a.length;i++) {
	    	  if(a[i]>max)
	    		  max=a[i];
	      }
	      int cnt[] = new int[max+1];
	      for( i=0;i<a.length;i++) 
	    	  cnt[a[i]]++;
	      for( i=0;i<a.length;i++) 
	    	  System.out.println(cnt[i]+" ");
	      for ( i = 1; i < cnt.length; i++) 
	            cnt[i] += cnt[i - 1];
	      int a2[] = new int[a.length];
	      for( i=0;i<a.length;i++) {
	              a2[cnt[a[i]- 1]] = cnt[i];
	              cnt[cnt[i]]--;
	      }
	      for(i=0;i<a.length;i++)
	    	  System.out.print(a2[i]+" ");

	


    }
}


