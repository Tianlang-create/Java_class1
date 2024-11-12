import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		File f = new File("Test.txt");
		FileInputStream fis = new FileInputStream(f);
		while(true){
			int b = fis.read();
			if(b==-1) break;
			System.out.print((char)b);				
		}
		fis.close();
	}	
}