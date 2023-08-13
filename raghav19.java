public class raghav19{
  public static void FirstAndLast(String x)
	{
		int i;

		for (i = 0; i < x.length(); i++) {

			
			if (i == 0)
				System.out.print(x.charAt(i));

			if (i == x.length() - 1)
				System.out.print(x.charAt(i));
                  if (i == x.length()/2)
				System.out.print(x.charAt(i));

			
			if (x.charAt(i) == ' ') {
				System.out.print(x.charAt(i - 1)	+ " " + x.charAt(i + 1));
			}
		}
	}

	
	public static void main(String args[])
	{
		String x= "ragav";
		FirstAndLast(x);
	}
}
