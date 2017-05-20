public class HelloWorld {
	
	public String hwstring;
	public String name;
	
	HelloWorld(String firstname, String lastname){
		hwstring = "Hello World, my name is: ";
		name = firstname + " " + lastname;
	}
	
	public void printout(){
		System.out.println(hwstring + name);
	}
}
