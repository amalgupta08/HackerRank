import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ServiceLane {
	
	public static void main(String arg[]) throws NumberFormatException, IOException {
	
		int n,t,i,a,b,j,min;
		String str1,str2,str3;
		String[] str=new String[2];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		str1=br.readLine();
		str=str1.split(" ");
		n=Integer.parseInt(str[0]);
		t=Integer.parseInt(str[1]);
		int[] width=new int[n];
		str2=br.readLine();
		for(i=0,j=0;i<str2.length();j++)
		{
			width[j]=Integer.parseInt(str2.charAt(i)+"");
			i=i+2;
		}
		for(i=0;i<t;i++)
		{
			str3=br.readLine();
			str=str3.split(" ");
			a=Integer.parseInt(str[0]);
			b=Integer.parseInt(str[1]);
			min=3;
			for(j=a;j<=b;j++)
			{
				if(min>width[j])
				{
					
					min=width[j];
				}
			}
			System.out.println(min);
		}
	}

}
