import java.util.Scanner;

public class BMICalculator {
	private Scanner in = new Scanner(System.in);
	float bmi, height, weight;
	int unitType;
	String category, unitTypeHeight, unitTypeWeight;
	
	public static void main(String[] args)
	{
		BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	public void readUserData() {
		readUnitType();
		readMeasurementData();
	}
	private void readUnitType()	{
		do {
		System.out.println("Please select a measurement type. Choose 0 for metric and 1 for imperial.");
		unitType = in.nextInt();
		} while(unitType != 0 && unitType != 1);
	}
	private void readMeasurementData() {
		if(unitType == 0)
			readMetricData();
		else
			readImperialData();
	}
	private void readImperialData() {
		unitTypeHeight = "inches";
		unitTypeWeight = "pounds";
		setWeight();
		setHeight();
	}
	
	private void readMetricData(){
		unitTypeHeight = "meters";
		unitTypeWeight = "kilograms";
		setWeight();
		setHeight();
	}
	
	private void calculateBmi() {
		if(unitType == 0)
			bmi = getWeight()/(getHeight()*getHeight());
		else
			bmi = (703 * getWeight()/(getHeight()*getHeight()));
		calculateBmiCategory();
	}
	
	private void calculateBmiCategory() {
		if(getBmi() >= 30)
			category = "Obese";
		else if(getBmi() < 30 && getBmi() >= 25)
			category = "Overweight";
		else if(getBmi() < 25 && getBmi() >= 18.5)
			category = "Normal weight";
		else if(getBmi() < 18.5)
			category = "Underweight";
	}
	
	private void setWeight() {
		System.out.println("Please type in your weight in "+unitTypeWeight+".");
		weight = in.nextFloat();
		
		//error out
		if(weight < 0)
			System.exit(0);
	}
	
	public float getWeight() {
		return weight;
	}

	private void setHeight() {
		System.out.println("Please type in your height in "+unitTypeHeight+".");
		height = in.nextFloat();
		
		//error out
		if(height < 0)
			System.exit(0);
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getBmi() {
		return bmi;
	}
	
	public String getBmiCategory() {
		return category;
	}
	
	public void displayBmi()
	{
		System.out.printf("Your BMI is %.1f. You are categorized as %s", getBmi(), getBmiCategory());
	}
}
