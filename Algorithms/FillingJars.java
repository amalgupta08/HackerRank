import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FillingJars {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		long k,sum=0;
		int a,b,n,m;
		String str1;
		String[] line1=new String[2];
		String[] line2=new String[3];
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		str1= br.readLine();
		line1=str1.split(" ");
		n=Integer.parseInt(line1[0]);
		m=Integer.parseInt(line1[1]);
		long[] jars=new long[n];
		for(int i=0;i<m;i++)
		{
			str1= br.readLine();
			line2=str1.split(" ");
			a=Integer.parseInt(line2[0]);
			b=Integer.parseInt(line2[1]);
			k=Integer.parseInt(line2[2]);
			for(int j=a-1;j<b;j++)
			{
				jars[j]+=k;
				sum+=jars[j];
			}
		}
		System.out.println(sum/n);
	}

}
