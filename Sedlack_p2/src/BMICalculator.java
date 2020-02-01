import java.util.Scanner;

public class BMICalculator {
	float BMI, height, weight;
	String category;
	boolean metric = false;
	public void readUserData()
	{
		String unit;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Are you using Kilos or Pounds?");
		unit=userInput.nextLine();
		if(unit.equals("kilos")||unit.equals("Kilos"))
		{
			metric = true;
			System.out.println("What is your weight in kilos?");
			weight = userInput.nextFloat();
			System.out.println("What is your height in meters?");
			height = userInput.nextFloat();
		}
		else if(unit.equals("Pounds")||unit.equals("pounds"))
		{
			metric = false;
			System.out.println("What is your weight in pounds?");
			weight = userInput.nextFloat();
			System.out.println("What is your height in inches?");
			height = userInput.nextFloat();
		}
	}
	public void calculateBmi()
	{
		if(metric)
		{
			BMI = (weight)/(height*height);
		}
		else
		{
			BMI = (703*weight)/(height*height);
		}
		
		if(BMI < 18.5)
			category = "Underweight";
		else if(BMI > 18.5 && BMI < 24.9)
			category = "Normal Weight";
		else if(BMI >24.9 && BMI < 29.9)
			category = "Overweight";
		else if(BMI > 30)
			category = "Obesity";
	}
	public void displayBmi()
	{
		System.out.printf("Your BMI is %.1f. You are categorized as %s", BMI, category);
	}
}
