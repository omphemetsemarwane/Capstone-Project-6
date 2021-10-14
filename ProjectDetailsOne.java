//The ProjectDetails class was created to create type of person object with certain attributes

//The PoisedFirm class is used to call this class

//A class is a blueprint from which objects are made (It consists of both data and the code that manipulates the data)

//A public modifier was assigned to the class for easy direct access

//Specific attributes (the data that the class stores) about the object were collected 

//Attributes are features that an object can take on

//Methods such as Constructor method and showTypeOfPerson() method were used

//Methods have a code that describes what an object can do

//Constructor method is used to create a new object

//showProjectDetails() method returns a String object that we’ll use outside the class to display the contents of each object

//Main class was declared
public class ProjectDetailsOne {
	
	//Attributes(explains features that an object has, attributes is the data that the class stores)
	int projectnumber;
	String projectname;
	String typeofbuilding;
	String physicaladdress;
	String ERFNumber;
	double projectcost;
	double amountpaid;
	String deadline;
	
	//Constructor are used to create a new object in the program
	//This method is used to initialize the attributes to the values that are specified for each object
	//This method contains the code used to create the object
	//When a new object of the class is created its new attributes are given values
	//this keyword reffers to attributes in the new object
	
	public ProjectDetailsOne(int projectnumber, String projectname, String typeofbuilding, String physicaladdress, String ERFNumber, double projectcost, double amountpaid, String deadline) {
	
	this.projectnumber = projectnumber;
	this.projectname = projectname;
	this.typeofbuilding = typeofbuilding;
	this.physicaladdress = physicaladdress;
	this.ERFNumber = ERFNumber;
	this.projectcost = projectcost;
	this.amountpaid = amountpaid;
	this.deadline = deadline;

}
	//showProjectDetails method returns a String object that we’ll use outside the class to display the contents of each object
	public String showProjectDetails() {
		
		System.out.println("The details for project " + projectname + " are as follows: \n");
		String output = "Project Number: " + projectnumber;
		output += "\nProject Name: " + projectname;
		output += "\nBuilding Type: " + typeofbuilding;
		output += "\nPhysical Address: " + physicaladdress;
		output += "\nERF Number: " + ERFNumber;
		output += "\nProject Fee Total: R" + projectcost;
		output += "\nAmount Paid to Date: R" + amountpaid;
		output += "\nProject Deadline: " + deadline;
		
		//String output is returned
		return output;
	}
	
}	
