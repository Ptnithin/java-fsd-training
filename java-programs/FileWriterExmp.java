import java.io.IOException;
//import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;

public class FileWriterExmp

	{
		public static void main(String[] args) throws IOException

		{
			String str="Writing contents to file";
			FileWriter f=new FileWriter("Sample.txt");

			for(int i=0;i<str.length();i++)

					{
						f.write(str.charAt(i));
					}

			f.write("\n");

			char[] arr={'a','b','c','d'};
			f.write(arr);
			f.write("\n");


			f.write(arr,1,3);
			f.write("\n");

			String str1="Welcome to the world of programming";
			f.write(str1);
			f.write("\n");
			f.appand()

			f.write(str1,6,14);
			f.write("\n");

			f.close();
		}
	}