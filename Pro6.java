import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		FileInputStream fis = new FileInputStream("t1.txt");
		FileOutputStream fos = new FileOutputStream("t2.txt");
		while(true){
			int b = fis.read();
			if(b==-1)	break;
			fos.write(b+3);
		}
		fos.close();
		fis.close();
	}	
}