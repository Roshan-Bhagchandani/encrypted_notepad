
package encryptednotepad;


public class DecimalToBinary 
{
    public String getBoolean(int decimal)
	{
		StringBuffer result = new StringBuffer();
		while(decimal != 0)
		{
			result.append((char)((decimal%2)+48));
			decimal = decimal/2;
		}
		result = result.reverse();
		return result.toString();
	}
	public String getFormattedBoolean(int decimal,int zeros)
	{
		StringBuffer result = new StringBuffer();
		while(decimal != 0)
		{
			result.append((char)((decimal%2)+48));
			decimal = decimal/2;
		}
		result = result.reverse();
		for(int i=result.length();i<zeros;i++)
		{
			result.insert(0,'0');
		}
		return result.toString();


	}
    public static void main(String[] args) 
    {
    	DecimalToBinary dtb = new DecimalToBinary();
    	for(int i=0;i<10;i++)
    	{
    		System.out.println(dtb.getFormattedBoolean(i,4));
    	}	
    }

    
}
