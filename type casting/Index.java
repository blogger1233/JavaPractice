//Demonstrate cast
public class Index{
    public static void main(String[] args){
	byte b;
	int i = 257;
	double d = 125.258;

	System.out.println("Conversion of int to byte.");
	b = (byte) i;
	System.out.println("i and b "+i+" "+b);

	System.out.println("Conversion of double to int.");
	i = (int) d;
	System.out.println("d and i "+d+" "+i);

	System.out.println("Conversion of double to byte.");
	i = (byte) d;
	System.out.println("byte and double "+d+" "+b);


	
	
    }
}
