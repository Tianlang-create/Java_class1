import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		String str = "CSU中南大学"; 
		File f = new File("Test.txt");
		FileOutputStream fos = new FileOutputStream(f,true);
		byte[] b = str.getBytes();
		for(int i=1;i<=100;i++)		fos.write(b);
		
		fos.close();
	}	
}