import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindDigits {
	public static void main(String arg[]) throws NumberFormatException, IOException {
		int t,divisible,i,digit;
		long n,no;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		for(i=0;i<t;i++)
		{
			n=Integer.parseInt(br.readLine());
			no=n;
			divisible=0;
			while(no!=0)
			{
				digit=(int)(no%10);
				no=no/10;
				if(n%digit==0)
				{
					divisible++;
				}
			}
			System.out.println(divisible);
		}
	}
	
}
