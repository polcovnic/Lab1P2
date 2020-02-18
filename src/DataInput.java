package DataInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class DataInput {

	private static void writeText(String wr){
		if (wr == null)
			System.out.print("Введіть дані: ");
		else 
			System.out.print(wr);
	}
	
	public static Long getLong() throws IOException{
		String s = getString("");
		Long value = Long.valueOf(s);
		return value;
	}
	
	public static char getChar() throws IOException{
		String s = getString("");
		return s.charAt(0);
	}
	
	public static Integer getInt(String wr){
		writeText(wr);
		String s = "";
		Integer value = 0;
		boolean input = true;
		while(input) {
			s = getString("");
			try {
				input = false;
				value = Integer.valueOf(s);
			}catch(NumberFormatException e) {
				System.out.println("Wrong input. Please enter INTEGER number");
				input = true;
			}
			
		}
		return value;
	}
	
	public static Double getDouble(String wr){
		writeText(wr);
		String s = "";
		Double value = 0.0;
		boolean input = true;
		while(input) {
			s = getString("");
			try {
				input = false;
				value = Double.valueOf(s);
			}catch(NumberFormatException e) {
				System.out.println("Wrong input. Please enter INTEGER number");
				input = true;
			}
			
		}
		return value;
	}
	
	public static String getString(String o){
		System.out.println(o);
		String s = "";
		while(true) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
			try {
				s = br.readLine();
			} catch (IOException e) {
				System.out.println("Problems with buffered reader");
			}
		if(!s.equals(""))
			break;
		System.out.println("Empty input. Please reenter");
		}
		return s;
	}
	
}
