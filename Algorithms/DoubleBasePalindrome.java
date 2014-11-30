import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DoubleBasePalindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		number=Integer.parseInt(br.readLine());
		System.out.println(baseConversion(number, 2));
	}
	
	
	public static long baseConversion(int number,int base)
	{
		int i=0;
		long converted=0;
		 while (number != 0)
	        {	
	            i++;
	            System.out.println(((long)number)%base);
	            converted = (converted*10)+((long)number)%base;
	            number = number / base;
	        }
		
		return converted;
	}

}
