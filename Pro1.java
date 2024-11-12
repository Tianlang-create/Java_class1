import java.io.*;

class Test{
	public static void main (String[] args) throws Exception{	
		File f = new File("c:/Windows");
		File[] files = f.listFiles();
		for(File file : files){
			System.out.println(file.getAbsolutePath());
		}
	}	
}