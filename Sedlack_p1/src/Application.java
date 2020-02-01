import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		String input = "";
		Scanner mainScan = new Scanner(System.in);
		while(!(input.equals("end")))
		{
			System.out.println("Would you like to encrypt or decrypt?");
			System.out.println("Type \"a\" or \"encrypt\" to encrypt");
			System.out.println("or");
			System.out.println("\"b\" or\"decrypt\" to decrypt");
			System.out.println("or");
			System.out.println("type \"end\" to stop the program");
			input = mainScan.next();
			if(input.equals("a") || input.equals("encrypt"))
				Encrypter.encrypter();
			else if(input.equals("b") || input.equals("decrypt"))
				Decrypter.decrypter();
			else if(!input.equals("end"))
				System.out.println("You have typed an incompatible value, please try again.");
		}
		mainScan.close();
	}
}
