package GItHub;

public class Saample_1 {

	
	
	public static void main(String[] args) 
	{
	
		
	     String org="I am sonali";
		 
	    String s1=reversesentense(org);
		
		System.out.println(s1);
	}
	                                        //0  1  2
	                                        //I am sonali
	    public static  String reversesentense(String sentense)
	    {
	    	
	    	
	    	String[] text=sentense.split(" ");
	    	String rev=" ";
	    	 
	   
	       
	 

    	   for(int i=text.length-1; i>=0; i--)
    	  {
    		
    		        rev=rev+text[i]+" ";
    	
    	  }
    	       
    	         return rev;
    	
	
	
	
}
		
}
