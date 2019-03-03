/*
*  This class play the role of the Bridge by connecting both layers of abstraction.
*  With the Bridge Design Pattern you create 2 layers of abstraction.
*  In this example I have an abstract class representing person
*  profiles. On the other side of the bridge I also have an abstract class
*  that will represent different features for this profiles.
*  This allows me to use an infinite variety of profiles and person features by combining them using the bridge pattern.
 */

public class Test{
	
	public static void main(String[] args){
		
		//create the new profiles 
		PersonFeatures theProfile1 = new WithGlasses(new Woman(50));		
		PersonFeatures theProfile2 = new NoGlasses(new Woman(35));		
		PersonFeatures theProfile3 = new NoGlasses(new Man(40));
		
		System.out.println("Profile 1: Woman with Glasses");
		//calling methods to add features to our objects
		theProfile1.longHair();
		theProfile1.contactLenses();
		theProfile1.personAge();
		
		System.out.println("\nProfile 2: Woman with No Glasses");
		theProfile2.shortHair();
		theProfile2.contactLenses();
		theProfile2.personAge();
		
		System.out.println("\nProfile 3: Men with No Glasses");
		theProfile3.shortHair();
		theProfile3.contactLenses();
		theProfile3.personAge();
		
	}
}