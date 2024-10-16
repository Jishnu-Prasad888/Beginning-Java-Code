import java.io.*;
class textedit  {
	public static void main(String[] args) throws IOException{
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 	String s[] = new String[100];
	 	System.out.println("Enter max 100 lines of text : ");
	 	System.out.println("enter stop to exit : ");

	 	for (int i = 0;i <=100 ;i++ ) {
	 		s[i] = br.readLine();
	 		if (s[i].equals("stop")) break;
	 	}
	 	
	 	for (int i = 0;i <= 100; i++ ) {
	 		if (s[i].equals("stop")) break;
	 		System.out.println(s[i]);
		}

	 } 
}