package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
	    int range = 7;
	    int fnum = 0;
	    int snum = 1;
	    int i=1;
	    int sum=0;
	   
	    {
	    	System.out.println(fnum);
	    }
	    
	    for (i=1;i<range;i++)
	    {
	    	
	    	sum = fnum + snum; 	    
	    	System.out.println(sum);
	    	fnum=snum;
	    	snum=sum;
	    } 
	    	
}
	
}