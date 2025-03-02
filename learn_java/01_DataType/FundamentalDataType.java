class FundamentalDataType
{
	public static void main (String[] args)
	{

		/*Integer Data Type
		If we start number with 0 then it will octal eg. 054
		If we start number with 0x then it will hexadecimal 0x65
		Don't write decimal number followed by 0.
		eg. 098 - gives error		
		*/
		byte int1=23; //1 byte Range: -128 (-2^7) to 127 (2^7-1)
		short int2=434; //2 byte Range: -32768 (-2^15) to 32767 (2^15-1)
		int int3=13443; //4 byte Range: -2,147,483,648 (-2^31) to 2,147,483,647 (2^31-1)
		long int4=909090; /*8 byte   Range: -9,223,372,036,854,775,808 (-2^63) to 9,223,372,036,854,775,807 (2^63-1)
		It must be followed by L*/
		int octa= 074;
		int hexa= 0x54;
		
		//float data type
		float flt1 = 1002f; //4 byte (7 decimal) (Must followed by f)
		double flt2=10020d; //8 byte (15 decimal)
		
		//character data type
		char ch = 'a';  //Range '\u0000' to '\uffff'
		
		//string data type
		String str1 = "Himanshu"; //S must be capital 
		
		//boolean data type 
		boolean bool = true; //true or false (only two values)
		
		System.out.println("byte int1= "+int1);
		System.out.println("short int2= "+int2);
		System.out.println("int int3= "+int3);
		System.out.println("long int4= "+int4);
		
		System.out.println("float flt1= "+flt1);
		System.out.println("double flt2="+flt2);
		
		System.out.println("char ch= "+ch);
		System.out.println("String str1="+str1);
		
		System.out.println("boolean bool= "+bool);
		
		System.out.println("int octa 074="+octa);
		System.out.println("int hexa 0x54= "+hexa);
	
	}
	
}