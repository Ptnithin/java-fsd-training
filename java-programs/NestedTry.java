/*Write a program to implement nested try-catch block for NUll Pointer exception
and NumberFormat Exception*/
class NestedTry

	{
		public static void main(String[] args)
			{
				String str=null;

				try
					{
						try	
						{
							if(str.equals("Nithin"))
									{
										System.out.print("Same");
									}
							else
									{
										System.out.print("Not same");
									}
						}

						catch (NullPointerException e)
						{
							System.out.println("NullPointerException Caught");
						}

						int a =Integer.parseInt(str);
					}

				catch (NumberFormatException e)
					{
						System.out.println("NumberFormatException caught");
					}
			}

	}