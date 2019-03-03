/* Abstraction
* This is an abstract class that will represent numerous
* features for each person profile we create.
*/

public abstract class PersonFeatures {
	
	// A reference to a generic person profile using aggregation
    private PersonProfile thePersonProfile;
    
    public PersonFeatures(PersonProfile newProfile){
        thePersonProfile = newProfile;}
    
    public void longHair() {
        thePersonProfile.longHair();}
    
    public void shortHair() {
        thePersonProfile.shortHair();
    }
    
    public void personAge(){
        thePersonProfile.personAge();}
    
    public abstract void contactLenses();
    
}
