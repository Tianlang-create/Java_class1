import java.io.*;
class Test{
	public static void main (String[] args) throws Exception{	
		PrintStream ps = new PrintStream("99X.txt");
		for(int i=1; i<=9; i++){
			for(int j=1; j<=i; j++){
				ps.print(i + "*" + j + "=" + i*j + "  ");
			}
			ps.println();
		}
		ps.close();
	}	
}