
/* Implementor
*  
*/
abstract class PersonProfile {
	
    public int personAge;
    public int maxAge = 90;
    
    public abstract void longHair();
    public abstract void shortHair();
    
    public void personAge() {
        if(personAge > maxAge || personAge < 0) { personAge = 0; }
        System.out.println("Person Age:  " + personAge);}
        
}
