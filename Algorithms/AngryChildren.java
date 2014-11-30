import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class AngryChildren {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,k,i;
		long fairness=1999999999;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		k=Integer.parseInt(br.readLine());
		long[] candies=new long[n];
		for(i=0;i<n;i++)
		{
			candies[i]=Integer.parseInt(br.readLine());		
		}
		Arrays.sort(candies);
		for(i=0;i<n-(k-1);i++)
		{
			if((candies[i+k-1]-candies[i])<fairness)
			{
				fairness=(candies[i+k-1]-candies[i]);
			}
		}
		System.out.println(fairness);
	}

}
