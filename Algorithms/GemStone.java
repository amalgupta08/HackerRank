import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GemStone{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,found=0;
        String str,gem="";
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            str=br.readLine();
            if(i==0)
            {
            	for(int j=0;j<str.length();j++)
            	{
            		if(!gem.contains(""+str.charAt(j)))
            		{
            			gem+=str.charAt(j);
            		}
            	}
                System.out.println(gem);
            }
            else
            {
                for(int j=0;j<gem.length();)
                {
                	found=0;
                    for(int k=0;k<str.length();k++)
                    {
                    	if(gem.charAt(j)==str.charAt(k))
                    	{
                    		found=1;
                    		System.out.println("found "+gem.charAt(j));
                    		break;
                    	}
                    }
                    if(found==0)
                    {
                    	System.out.println("not found "+gem.charAt(j));
                    	gem=gem.substring(0, j)+gem.subSequence(j+1, gem.length());
                    	continue;
                    }
                    //System.out.println("gem "+gem);
                    j++;
                }
            }
        }
       
        System.out.println(gem.length());
    }
}
