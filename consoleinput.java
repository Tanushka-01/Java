package javaproject;

public class consoleinput {
public static String getString(){
	try
	{
		byte [] arrInput= new byte[100];
		
        //System.out.println("Enter the choice : ");
		
		int length = System.in.read(arrInput);
		byte [] arrFinal = new byte[length -2];
		System.arraycopy(arrInput , 0, arrFinal, 0, length -2);
		String objString =new String(arrFinal);
		return objString;
	}
		
	catch(Exception e)
	{
		System.out.println(e);
	}
	return null;
	
}

            public static double getDouble()
          {
	     return Double.parseDouble(getString());
}
//          public static float getFloat()
//        {
//        	  return Float.parseFloat(getString());
//        }
          public static int getInteger()
          {
        	  String objString = getString();
        	  int num= Integer.parseInt(objString);
        	  return num;
          	  
          }
//          public static char getChar()
//          {
//          	  return Char.parseChar(getString());
//          }
          
} 
	
	

