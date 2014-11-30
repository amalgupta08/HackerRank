import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SherlockAndTheBeast {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t,n,i,j,fives,threes;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		
		for(i=0;i<t;i++)
		{
			n=Integer.parseInt(br.readLine());
			
			if(n<3)
			{
				System.out.println("-1");
				continue;
			}
			
			else if(n%3==0)
			{
				threes=n/3;
				fives=0;
			}
			else if(n%3==1)
			{
                if(n>=10)
                {
				    threes=(n/3)-3;
				    fives=2;
                }
                else
                {
                  System.out.println("-1");
				continue;  
                }
			}
			else
			{
				threes=(n/3)-1;
				fives=1;
			}
			for(j=0;j<threes;j++)
			{
				System.out.print("555");
			}
			for(j=0;j<fives;j++){
				System.out.print("33333");
			}
			System.out.print("\n");
		
		}

	}

}
