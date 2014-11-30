import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SherlockAndQueries {
	public static void main(String[] args) throws IOException {
		int n,m;;
		String str;
		String[] line1=new String[2];
		String A;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		line1=str.split(" ");
		n=Integer.parseInt(line1[0]);
		m=Integer.parseInt(line1[1]);
		String[] line2=new String[n];
		String[] line3=new String[m];
		int[] a=new int[n];
		int[] b=new int[m];
		int[] c=new int[m];
		A=br.readLine();
		line2=A.split(" ");	
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(line2[i]);
		A=br.readLine();
		line3=A.split(" ");	
		for(int i=0;i<m;i++)
			b[i]=Integer.parseInt(line3[i]);
		A=br.readLine();
		line3=A.split(" ");	
		for(int i=0;i<m;i++)
			c[i]=Integer.parseInt(line3[i]);
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j%b[i-1]==0)
				{
					a[j-1]=(a[j-1]*c[i-1])%(1000000007);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
