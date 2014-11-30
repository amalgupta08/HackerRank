import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IsFibo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t,isFibo ;
		long n,a,b;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		t= Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			isFibo=0;
			a=0;
			b=1;
			n= Long.parseLong(br.readLine());
			if(n==a)
				isFibo=1;
			while(b<=n)
			{
				if(n==b)
				{
					isFibo=1;
				}
				b=a+b;
				a=b-a;
			}
			if(isFibo==1)
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo");
		}

	}

}
