import java.io.IOException;
//import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;

public class FileWriterExmp1

	{
		public static void main(String[] args) throws IOException

			{
				String fl="Output.txt";
				String str1="My first name is Nithin";
				String str2="My last Name is pt";

				FileWriter f=new FileWriter(fl);

				for(int j=0;j<str1.length();j++)

						{
							f.write(str1.charAt(j));
						}
				f.write("\n");

				char[] arr={'a','b','c','d'};
				f.write(arr);
				f.write("\n");

				f.write(str2,0,12);
				f.write("\n");

				f.append("varghese");
				f.write("\n");

				f.append(str2,0,18);
				f.write("\n");

				f.write ('a');
				f.write("\n");

				
				f.flush();
				f.close();

			}
	}