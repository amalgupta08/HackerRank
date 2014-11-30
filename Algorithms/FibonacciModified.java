

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FibonacciModified {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] temp=new String[3];
		temp = str.split(" ");
		
		BigInteger a=BigInteger.valueOf(0);
		BigInteger b=BigInteger.valueOf(0);
		BigInteger no=BigInteger.valueOf(0);
		int n;
		
		int at=Integer.parseInt(temp[0]);
		a=BigInteger.valueOf(at);
		int bt=Integer.parseInt(temp[1]);
		b=BigInteger.valueOf(bt);
		n=Integer.parseInt(temp[2]);
		System.out.println(b);
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(b);
		else
		{
			for(int i=3;i<=n;i++)
			{
				no=a.add(b.multiply(b));
				a=b;
				b=no;
			}
			System.out.println(no);
		}
	}

}
