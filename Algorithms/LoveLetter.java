import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class LoveLetter {
	public static void main(String a[]) throws IOException
	{
		int testCases, i, noOfSteps ;
		String str;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		testCases= Integer.parseInt(br.readLine());
		for(i=0;i<testCases;i++)
		{
			str=br.readLine();
			noOfSteps=stepsForPalindrome(str);
			System.out.println(noOfSteps);
		}
	}

	private static int stepsForPalindrome(String str) {
		int steps=0,len,j;
		len = str.length();
		j=len-1;
		for(int i=0;i<len/2;i++,j--)
		{
			if(str.charAt(i)>str.charAt(j))
			{
				int diff;
				diff=(str.charAt(i)-str.charAt(j));
				System.out.println("diff "+diff);
				char c;
				c=(char) (str.charAt(i)-diff);
				String nStr= str.substring(0, i)+c+str.subSequence(i+1, len);
				str=nStr;
				steps+=diff;
			}
			else if(str.charAt(i)<str.charAt(j))
			{
				int diff;
				diff=(str.charAt(j)-str.charAt(i));
				System.out.println("diff "+diff);
				char c;
				c=(char) (str.charAt(j)-diff);
				String nStr= str.substring(0, j)+c+str.subSequence(j+1, len);
				str=nStr;
				steps+=diff;
				
			}
		}
		
		return steps;
	}

}
