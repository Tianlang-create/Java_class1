import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		FileInputStream fis = new FileInputStream("img2");
		FileOutputStream fos = new FileOutputStream("img3");
		while(true){
			int b = fis.read();
			if(b==-1)	break;
			fos.write(b-3);
		}
		fos.close();
		fis.close();
	}	
}