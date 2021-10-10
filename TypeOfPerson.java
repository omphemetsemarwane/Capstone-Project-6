//The TypeOfPerson class was created to create type of person object with certain attributes

//The PoisedFirm class is used to call this class

//A class is a blueprint from which objects are made (It consists of both data and the code that manipulates the data)

//A public modifier was assigned to the class for easy direct access

//Specific attributes (the data that the class stores) about the object were collected 

//Attributes are features that an object can take on

//Methods such as Constructor method and showTypeOfPerson() method were used

//Methods have a code that describes what an object can do

//Constructor method is used to create a new object

//showTypeOfPerson() method returns a String object that we’ll use outside the class to display the contents of each object

//Main class was declared
public class TypeOfPerson {
	
	//Attributes(explains features that an object has, attributes is the data that the class stores)
	String typeofperson;
	String name;
	int telnumber;
	String emailaddress;
	String physicaladdress;
	
	//Constructor are used to create a new object in the program
	//This method is used to initialize the attributes to the values that are specified for each object
	//This method contains the code used to create the object
	//When a new object of the class is created its new attributes are given values
	//this keyword reffers to attributes in the new object
	public TypeOfPerson(String typeofperson, String name, int telnumber, String emailaddress, String physicaladdress) {
		
		this.typeofperson = typeofperson;
		this.name = name;
		this.telnumber = telnumber;
		this.emailaddress = emailaddress;
		this.physicaladdress = physicaladdress;
		
}
	//showTypeOfPerson method returns a String object that we’ll use outside the class to display the contents of each object
public String showTypeOfPerson() {
		
		System.out.println(typeofperson + " details are as follows: \n");
		String output = "Title: " + typeofperson;
		output += "\nName: " + name;
		output += "\nNumber: " + telnumber;
		output += "\nEmail Address: " + emailaddress;
		output += "\nPhysical Address: " + physicaladdress;
		
		//String output is returned
		return output;
}		
}