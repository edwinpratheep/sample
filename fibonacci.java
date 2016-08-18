package edwin;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,c=1;
		for(int i=1;i<=5;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
