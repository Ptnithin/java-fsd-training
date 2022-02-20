import java.io.File;
import java.util.*;
public class ScannerRead
{
	public static void main(String[] args)
	{
	File file=new File("C:testout.txt");
	Scanner sc=new Scanner(file);
	StringBuffer sb=new StringBuffer();
	while(sc.hasNext())
	{
		sb.append(" "+sc.nextLine());
	}
	System.out.println(sb);
    }
}