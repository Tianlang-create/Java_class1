import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		BufferedReader br = new BufferedReader(new FileReader("����.txt"));
		while(true){
			String s = br.readLine();
			if(s==null)  break;
			System.out.println(s);
		}
		br.close();
	}	
}