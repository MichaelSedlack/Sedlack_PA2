import java.util.Scanner;

public class Decrypter {
	public static void decrypter() {
		int inputVar, temp, length;
		int[] var = new int [4]; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input your 4 digit data: ");
		inputVar = scan.nextInt();
		length = (int) (Math.log10(inputVar)+1);
		if(length == 4)
		{
			for(int i = 3; i > 0; i--)
			{
				var[i] = inputVar%10;
				inputVar/=10;
			}
			var[0] = inputVar;
			for(int i = 0; i < 4; i++)
			{
				var[i] += 3;
				var[i] = var[i]%10;
			}
			temp = var[0];
			var[0] = var[2];
			var[2] = temp;
			temp = var[1];
			var[1] = var[3];
			var[3] = temp;
			System.out.println(var[0]+""+var[1]+""+var[2]+""+var[3]);
		}
		else if(length == 3)
		{
			for(int i = 3; i > 1; i--)
			{
				var[i] = inputVar%10;
				inputVar/=10;
			}
			var[1] = inputVar;
			var[0] = 0;
			for(int i = 0; i < 4; i++)
			{
				var[i] += 3;
				var[i] = var[i]%10;
			}
			temp = var[0];
			var[0] = var[2];
			var[2] = temp;
			temp = var[1];
			var[1] = var[3];
			var[3] = temp;
			System.out.println(var[0]+""+var[1]+""+var[2]+""+var[3]);
		}
		else if(length == 2)
		{
			for(int i = 3; i > 2; i--)
			{
				var[i] = inputVar%10;
				inputVar/=10;
			}
			var[2] = inputVar;
			var[1] = 0;
			var[0] = 0;
			for(int i = 0; i < 4; i++)
			{
				var[i] += 3;
				var[i] = var[i]%10;
			}
			temp = var[0];
			var[0] = var[2];
			var[2] = temp;
			temp = var[1];
			var[1] = var[3];
			var[3] = temp;
			System.out.println(var[0]+""+var[1]+""+var[2]+""+var[3]);
		}
		else if(length == 1)
		{
			var[3] = inputVar;
			var[2] = 0;
			var[1] = 0;
			var[0] = 0;
			for(int i = 0; i < 4; i++)
			{
				var[i] += 3;
				var[i] = var[i]%10;
			}
			temp = var[0];
			var[0] = var[2];
			var[2] = temp;
			temp = var[1];
			var[1] = var[3];
			var[3] = temp;
			System.out.println(var[0]+""+var[1]+""+var[2]+""+var[3]);
		}
		else if(inputVar == 0)
		{
			var[0] = 0;
			var[1] = 0;
			var[2] = 0;
			var[3] = 0;
			for(int i = 0; i < 4; i++)
			{
				var[i] += 3;
				var[i] = var[i]%10;
			}
			temp = var[0];
			var[0] = var[2];
			var[2] = temp;
			temp = var[1];
			var[1] = var[3];
			var[3] = temp;
			System.out.println(var[0]+""+var[1]+""+var[2]+""+var[3]);
		}
		else
		{
			System.out.println("You have typed an incompatible value, please try again.");
		}
	}
}