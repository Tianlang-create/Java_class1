import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		File f = new File("Test.txt");
		FileInputStream fis = new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		fis.read(b);
		String str = new String(b);	
		System.out.println(str);		
		fis.close();
	}	
}