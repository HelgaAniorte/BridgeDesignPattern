
public class Man extends PersonProfile {

	public Man(int newPersonAge){
        personAge = newPersonAge;
        
    }
	
    public void longHair() {
        System.out.println("Long Hair");
        }
    
    public void shortHair() {
        System.out.println("Short Hair");
    }
    
    public void personAge() {
        if(personAge > maxAge || personAge < 0) { personAge = 0; }
        System.out.println("Person Age:  " + personAge);}
}
