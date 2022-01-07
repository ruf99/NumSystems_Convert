import java.util.Scanner;
public class num_convert {
	public static void main(String[] args) {

	/* Short-Summary of the code:
	There are a total of 6 methods in this program. 
	Instead of creating 12 methods that would convert all four number systems to the other four, I decided to create 6. They are as follows:
	Binary to Decimal.
	Binary to Octal.
	Binary to HexaDecimal. 

	Decimal to Binary.
	Octal to Decimal.
	HexaDecimal to Decimal. 

	By creating one main number system converter (Binary) that converts to the other three, 
	all I had to do was ensure I created other number systems that would simply convert to Binary, or Decimal (which converts to Binary easily).
	I have created multiple if and nested if statements to print out the exact "from" system to the exact "to" system, so that the user can see what number systems they are using. 

	*/

	//Declaring Strings as they will be needed for the program to recognize what Number System to convert from and which one to, to make it efficient for the user.

	String a = "bin";
	String b = "dec";
	String c = "oct";
	String d = "hex";


	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the name of a Number System you want to convert from - bin, or dec, or oct, or hex: "); //user input
	String from_NumSystem = input.nextLine();

	System.out.println("Please enter the name of a Number System you want to convert to - bin, or dec, or oct, or hex: "); // user input
	String to_NumSystem = input.nextLine();

	/*These are a extensive print statements for each case of number system conversion. 
	They are merely present to invoke different methods, and to print out the final result. 
	The methods are listed at the end of all these statements.*/

	//FROM Binary Number System:

	if (from_NumSystem.equals(a)) {
		if (to_NumSystem.equals(b)) {
			System.out.println("Please enter a Binary Number to convert from (between 0000 & 1111) to Decimal Number System: ");
			String binary2dec = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from Binary to Decimal is = " + obj.fromBinary(binary2dec,to_NumSystem));
		}

		if (to_NumSystem.equals(c)) {
			System.out.println("Please enter a Binary Number to convert from (between 0000 & 1111) to Octal Number System: ");
			String binary2oct = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from Binary to Octal is = " + obj.to_Octal(binary2oct,from_NumSystem,to_NumSystem));
		}

		if (to_NumSystem.equals(d)) {
			System.out.println("Please enter a Binary Number to convert from (between 0000 & 1111) to HexaDecimal Number System: ");
			String to_hex = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from Binary to HexaDecimal is = " + obj.to_Hex(to_hex,from_NumSystem,to_NumSystem));
		}
		
			
	}
	



	//FROM Decimal Number System:

	if (from_NumSystem.equals(b)) {
		if (to_NumSystem.equals(a)) {
			System.out.println("Please enter a Decimal Number to convert from (between 1 & 15) to Binary Number System: ");
			String dec2bin = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from Decimal to Binary is = " + obj.from_Decimal(dec2bin,to_NumSystem));
		}

		if (to_NumSystem.equals(c)) {
			System.out.println("Please enter a Decimal Number to convert from (between 1 & 15) to Octal Number System: ");
			String dec2oct = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from Decimal to Octal is = " + obj.to_Octal(dec2oct,from_NumSystem,to_NumSystem));

		}

		if (to_NumSystem.equals(d)) {
			System.out.println("Please enter a Decimal Number to convert from (between 1 & 15) to HexaDecimal Number System: ");
			String dec2hex = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from Decimal to HexaDecimal is = " + obj.to_Hex(dec2hex,from_NumSystem,to_NumSystem));

		}
		
			
	}
	



	//FROM Octal Number System:

	if (from_NumSystem.equals(c)) {
		if (to_NumSystem.equals(a)) {
			System.out.println("Please enter an Octal Number to convert from (between 000 & 017) to Binary Number System: ");
			String oct2bin = input.nextLine();
			num_convert obj = new num_convert();
			String oct_to_bin = obj.Oct_To_Decimal(oct2bin);
			System.out.print("The converted number from Octal to Binary is = " + obj.from_Decimal(oct_to_bin,to_NumSystem));

		}

		if (to_NumSystem.equals(b)) {
			System.out.println("Please enter an Octal Number to convert from (between 000 & 017) to Decimal Number System: ");
			String oct2dec = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from Octal to Decimal is = " + obj.Oct_To_Decimal(oct2dec));
		}

		if (to_NumSystem.equals(d)) {
			System.out.println("Please enter an Octal Number to convert from (between 000 & 017) to HexaDecimal Number System: ");
			String oct2hex = input.nextLine();
			num_convert obj = new num_convert();
			String oct_to_hex = obj.Oct_To_Decimal(oct2hex);
			String decimal = "dec";
			System.out.print("The converted number from Octal to HexaDecimal is = " + obj.to_Hex(oct_to_hex,decimal,to_NumSystem));
		}
		
			
	}



	//FROM HexaDecimal Number System:

	if (from_NumSystem.equals(d)) {
		if (to_NumSystem.equals(a)) {
			System.out.println("Please enter a HexaDecimal Number to convert from (between 0000 & F) to Binary Number System: ");
			String hex2bin = input.nextLine();
			num_convert obj = new num_convert();
			String this_Is_Decimal_From_Hex = obj.fromHexaDec(hex2bin);
			String binary = "bin";
			System.out.print("The converted number from HexaDecimal to Binary is = " + obj.from_Decimal(this_Is_Decimal_From_Hex,to_NumSystem));
		}


		if (to_NumSystem.equals(b)) {
			System.out.println("Please enter a HexaDecimal Number to convert from (between 0000 & F) to Decimal Number System: ");
			String hex2dec = input.nextLine();
			num_convert obj = new num_convert();
			System.out.print("The converted number from HexaDecimal to Decimal is = " + obj.fromHexaDec(hex2dec));
		}

		if (to_NumSystem.equals(c)) {
			System.out.println("Please enter a HexaDecimal Number to convert from (between 0000 & F) to Octal Number System: ");
			String hex2oct = input.nextLine();
			num_convert obj = new num_convert();
			String this_Is_Decimal_From_Hex = obj.fromHexaDec(hex2oct);
			String decimal = "dec";
			System.out.print("The converted number from HexaDecimal to Octal is = " + obj.to_Octal(this_Is_Decimal_From_Hex,decimal,to_NumSystem));
		}
		
			
	}

} //main ends here
	
	//METHODS BEGIN:

	public String fromBinary(String bin, String to_Sys) { //this converts a String binary input to a decimal, and all the results are in String format, so we can pass on values for other number systems as well.
		int converted = 0; //this is the int that will hold the converted value 
		int counter = 0; //set up to keep the while loop going
		int base; //for decimal, base is 10
		int binary = Integer.parseInt(bin); //conversion of String input to Integer format for easier calculations.
		String result_dec = ""; //This string holds the return value, as method is String returning. (helpful for future use of method as well)

		String this_Is_Decimal = "dec"; // just another cautionary step to ensure we are converting to decimal.

		if (this_Is_Decimal.equals(to_Sys)) {
			while(binary >= 1) { //get while loop started
				base = 10;//for decimal
				int fromBin = binary%base; //this gets us our remainder
				converted += fromBin*Math.pow(2,counter); //this helps convert each number within the input value into a dec (If Input = 1111, conversion occuring is 1x8 + 1x4 + 1x2 + 1x1 = 15)
				binary = binary/base; //this helps the next loop prepare to continue the formula listed in the previous line. This way all 4 numbers get sorted and converted into their decimal value.
				counter++;			
			}
		
		}
		result_dec = result_dec + converted; //the result is add to an empty string
		return result_dec; //this is binary to decimal conversion
	}

	public String to_Octal(String to_Oct, String from_Sys, String to_Sys) {
		String this_Is_Octal = "oct";
		int base;
		int counter = 0;
		int this_Is_Input = Integer.parseInt(to_Oct);
		int convert_ToOctal = 0;
		int bin_ToDec = 0;
		counter = 0;
		String result_oct = "";
		base = 10;
		String this_Is_Binary = "bin";
		String this_Is_Decimal = "dec";
		String dec_toOct = "";


		if (this_Is_Binary.equals(from_Sys)) { 
			if (this_Is_Octal.equals(to_Sys)) {
				while(this_Is_Input >= 1){ //convert binary to decimal to make the conversion to octal easier. 
					if ((this_Is_Input % base) == 1){ 
						bin_ToDec += (1)* Math.pow(2,counter); 
					}
					counter++;
					this_Is_Input = this_Is_Input/base;
				}


				counter = 0;
				while (bin_ToDec > 0) { //decimal to octal conversion is also easy, since its the same formula, we just change the base to 8 in this case. 
					if((bin_ToDec % 8) != 0){
						convert_ToOctal += (bin_ToDec % 8) * Math.pow(base,counter);
					}
					counter++;
					bin_ToDec = bin_ToDec / 8;
				}
			}
			result_oct = result_oct + convert_ToOctal;
			return result_oct;
		
		}

		if (this_Is_Decimal.equals(from_Sys)) { //this is Decimal to Octal conversion, same as above. this is merely repeated here so we can invoke it from Decimal to Octal conversion as well.
			if (this_Is_Octal.equals(to_Sys)) {
				int count = 0;
				while (this_Is_Input >= 1){ //this is the same code from Binary to Octal, as in that process we convert the number to decimal first. 
					if ((this_Is_Input % 8) != 0){
						convert_ToOctal += (this_Is_Input % 8) * Math.pow(base, count);
					}
					count++;
					this_Is_Input = this_Is_Input / 8;
				}
			}
			dec_toOct = dec_toOct + convert_ToOctal;
			
		
		}
		return dec_toOct;
	}

	public String to_Hex(String input, String from_SystemConvert, String to_SystemConvert) { //This converts Binary to Decimal to HexaDecimal.
			String hexadec = "";
			String this_is_HexaDec = "hex";
			int count = 1;
			int bin_ToDecim = 0;
			int z;
			int bin_ToHexDec;
			int this_Is_Input = Integer.parseInt(input);
			String this_Is_Binary = "bin";
			String this_Is_Decimal = "dec";
			String dec_to_hexadec = "";


			if (this_Is_Binary.equals(from_SystemConvert)) {
				if (this_is_HexaDec.equals(to_SystemConvert)) { //converts binary to decimal here. 
					while(this_Is_Input != 0){ 
						z = this_Is_Input % 2; //remainder
						this_Is_Input = this_Is_Input / 10; //divide by base
						bin_ToDecim += z*count; //our decimal here is updated each time we get a remainder, since it will keep dividing by 10 till we get remainder 0.
						count = count * 2; //increases the count to keep the loop going till remainder is 0 and we have our decimal. 
					}

					while (bin_ToDecim != 0) { //decimal to hexadecimal
						bin_ToHexDec = (bin_ToDecim % 16); //according to the number system conversion table, we must divide the inputted number by the appropriate base which is 16 for hexadecimals.
						bin_ToDecim = bin_ToDecim / 16; //we keep dividing by 16 till we get a remainder of 0.

						if (bin_ToHexDec > 9){ //in case the inputted value is greater than 9, it will be an alphabet of the ascii value 65-70 (A-F)
							hexadec += (char)(bin_ToHexDec + 55); //we remove int 10 and add ascii value 65 to the string. It basically gives back a value from A-F.
						}

						else {
							hexadec += (bin_ToHexDec);
						}
					}
				}
				return hexadec;
				
			}

			if (this_Is_Decimal.equals(from_SystemConvert)) { //this is exclusively decimal to hexadecimal so we can invoke it for another conversion statement in main.
				if (this_is_HexaDec.equals(to_SystemConvert)) { //same procedure as above.
					while (this_Is_Input != 0) {
						bin_ToHexDec = (this_Is_Input % 16);
						this_Is_Input = this_Is_Input / 16;

						if (bin_ToHexDec > 9){
							dec_to_hexadec += (char)(bin_ToHexDec + 55);
						}

						else {
							dec_to_hexadec += (bin_ToHexDec);
						}
					}
				}
											
		}return dec_to_hexadec;
	}

	public String from_Decimal(String dec, String to_Sys){

		String this_Is_Binary = "bin";
		int decimal = Integer.parseInt(dec);
		int base = 2;
		int counter = 0;
		String result_bin = "";
		if (this_Is_Binary.equals(to_Sys)){
			while (decimal > 0) {
				int x = decimal % base; //we divide by 2 till we get remainder 0.
				if (x == 1) {
					counter++;			//increment counter to keep loop going till we reach a remainder of 0 and get our binary value.
				}
			result_bin = x + "" + result_bin; //we store each remainder in the string 
			decimal = decimal / base; //continue to divide to basically change the value of decimal in the while loop. if our remainder is 0, the while loop stops.
			
			}
		}

		return result_bin; //we obtain our binary value.
	}

	public String Oct_To_Decimal(String oct){
		int octal_input = Integer.parseInt(oct);
		String oct2dec = "";
		int x = 0;
		int base = 10;
		long decimal = 0;
		long y;

		while(octal_input > 0) { //We have used this exact same logic in a previous method as well.
			y = (long)((octal_input % base)*Math.pow(8,x++)); //We divide the octal number by base 10 acc to the formula => Input = ABC => (A x 8*8 + B x 8*1 + C x 8*0). We use Math class for help with calculations.
			decimal = (long)(decimal + y); //we store the value of the converted number here
			octal_input = octal_input / 10; //keep dividing till we get a remainder of 0. Once we do, while loop stops.
		}
		oct2dec = oct2dec + decimal;
		return oct2dec;	
	}

	public String fromHexaDec(String hexaDec){ //Last Method
		int hex_to_dec;
		int this_Is_Length;
		this_Is_Length = hexaDec.length();
		int result;
		String this_Is_Hex2Dec = "";

		if (this_Is_Length == 1) { //This method depends on user input length. If it is b/w 1 and 9, it will be in the form 000X, and if it is greater, it will be a character from English alphabet b/w A and F.
			char hex9 = hexaDec.charAt(0); //we measure length of the input, and on that basis, make two separate statements.
			if ((hex9 >= 65) && (hex9 <= 70)) { //this one is for characters. This adds 10 and subtracts value of the ascii character. if input is A, it will add int 10, and remove 65, thus making hexadec A to decimal 10.
				result = (10 + hex9 - 65);
				this_Is_Hex2Dec = this_Is_Hex2Dec + result; //we store our result in a string format.
			}
			return this_Is_Hex2Dec;
		}
		


		if (this_Is_Length == 4) { //this is for input b/w 1 and 9. it will simply convert the string into integer and return the value in the form of another string.
			hex_to_dec = Integer.parseInt(hexaDec);
			this_Is_Hex2Dec += hex_to_dec;

		}
		return this_Is_Hex2Dec;
	}
	//METHODS END HERE
}

//PROGRAM ENDS HERE. 