import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractice {
	public class SkillPractice {
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

String Dimes =JOptionPane.showInputDialog("how many dimes do you have?");



		// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, Dimes);


}



	// Ask the user how tall they are (inches)
String height =JOptionPane.showInputDialog("how tall are you?");
int heights = Integer.parseInt(height);{
		// If they are shorter than 36 inches, tell them to eat their Wheaties

if(heights<36) {
	JOptionPane.showMessageDialog(null, "go eat your weaties");


		}}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for (int i = 1; i < 31; i++) {
	if(i%3==0) {
		System.out.println(i);
}}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 

int x = new Random().nextInt(20);

		// Get another random number that is less than 10 and print it to the console 
int y = new Random().nextInt(10);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 

JOptionPane.showMessageDialog(null,x-y);

		}

		void skill4() { // In a pop-up, ask the user for the city they live in 
String city=JOptionPane.showInputDialog("what city do you live in?");
int cities = Integer.parseInt(city);
String sanDiego = "Sandiego";
		// If they answered "San Diego", tell them they live in Americ's Finest City 
if(city.equals(sanDiego)){
	System.out.println("you live in Americas finest city");

}
		// Otherwise, tell them to move to San Diego 
else {
	System.out.println("move somewhere else");}


		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

String car = JOptionPane.showInputDialog("how many cars do you have?");
int cars = Integer.parseInt(car);
if(cars==0) {
JOptionPane.showMessageDialog(null, "you must use public transportation");}
 else if(cars==1) {
	 
}
		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 



		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



		}
		}
}
