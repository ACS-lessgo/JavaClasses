package dayOne;

public class Validator {
	static boolean checkNumber(int num,int minValue,int maxValue) 
	{
		return(num>=minValue && num<=maxValue)?true:false;
	}
	static boolean checkNumber(float num,float minValue,float maxValue) 
	{
		return(num>=minValue && num<=maxValue)?true:false;
	}
	static boolean checkString(String name) 
	{
		if(name.matches("^[a-zA-z ]*$"))
				{
					return true;
				}
		else
				{
					return false;
				}
	}
}
