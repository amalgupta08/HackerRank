import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HalloweenParty {

	public static void main(String arg[]) throws NumberFormatException, IOException {
		
		int t,k;
		long maxProduct;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			k=Integer.parseInt(br.readLine());
			maxProduct=maxProduct(k);
			System.out.println(maxProduct);
		}
		
	}
	
	public static long maxProduct(int k) {
		int a,b;
		long max=0;
		for(a=1;a<=k/2;a++)
		{
			b=k-a;
			if((a*b)>max)
			{
				max=a*b;
			}
		}
		return max;	
	}
}
