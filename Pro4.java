import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		File f = new File("Test.txt");
		FileReader fr = new FileReader(f);
		while(true){
			int b = fr.read();
			if(b==-1) break;
			System.out.print((char)b);				
		}
		fr.close();
	}	
}