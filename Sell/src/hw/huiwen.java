package hw;

public class huiwen {
	public static boolean ishuiwen(String s)
	{
		char a[]=s.toCharArray();
		int i,n;
		boolean huiwen=true;
		n=a.length;
		for(i=0;i<n/2;i++)
		{
			if(a[i]!=a[n-1-i])
			{
				huiwen=false;break;
			}
		}
			if(huiwen)
				return true;
			else
				return false;
			
		
	}

}
