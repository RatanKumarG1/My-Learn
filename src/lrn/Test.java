package lrn;


public class Test {
	 @SuppressWarnings("finally")
	public int test(int i) {
	        try {
	        	if(i == 5){
//	        		throw new Exception();
		        	System.out.println("qqq");		        	
	        	}
	        	
	            return 1;
	        } catch (Exception e) {
	            return 3;
	        } finally {
	            return 12;
	        }
	    }

	    public static void main(String[] args) {
	    	Test t = new Test();
	        
	        System.out.println(t.test(1));
	    }
	    
	    
/*	    private Integer getnumber(){
	    	Integer i = null;
	    	try{
	    		if(i == null){
	    			System.out.println("ffff");
	    		}
	    	   return 5;
	    	}catch(Exception e){return 0;}
	    	finally{
	    	  return 7;
//	    	  System.out.println(i);
	    	}
	    	}*/
}
