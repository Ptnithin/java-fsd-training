import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
class FileReaderExmp
{
	public static void main(String[] args)throws IOException
	{
		File file1=new File("SampleOutputWriter.txt");
		int len=(int) file1.length();
		try(FileReader fr=new FileReader(file1))
		{
			
			System.out.println("Reading character by character");

                int i;

                while((i=fr.read())!=-1)

                {

                                System.out.print((char)i);

                }

			char[] y=new char[len];
			fr.read(y,0,7);
			String filecontent1=new String(y);
			System.out.println(filecontent1);

			System.out.println("reading single character");

                System.out.println((char)12);




		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}