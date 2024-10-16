import java.io.*;

class readfile { 
	public static void main(String[] args) {
		int i;
		FileInputStream fin;

		if(args.length != 1) { 
			System.out.println("Enter the file name as the argument");
			return
		}

		try {
			fin = new FileInputStream(args[0]);
		}catchh(FileNotFoundException e) {
			System.out.println("Cannot open file" + e);
		}

		try { 
			do {
			content = fin.read();
			if ( content != -1) {
				System.out.println((char)i);
			} 
		}while( i != -1);
	  }catch (IOException e) { 
	  	System.out.println("Error reading file");
	  }

	  try {
	  	fin.close();
	  }catch(IOException e) {
	  	System.out.println("Error closing file");
	  }
	}
}