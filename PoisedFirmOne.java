//A project management system was created for a small structural engineering firm called “Poised”

//This is a continuation of Task 7 Capstone Project

//The program was enhanced by incorporating  exception handling

//This program include try-catch blocks for error handling

//Refactoring was also used to make the code more readable, maintainable and testable

//A class PoisedFirm was created with the main() method,to run the main program and call other classes (TypeOfPerson & ProjectDetails)

//In this program project, TypeOfPerson and ProjectDetails classes are legitimate data types

//ProjectDetails and TypeOfPerson classes are (user-defined types = created by the user)

//The user input all the information required for the project, the details about the project are then displayed in a friendly-manner

//OOP allows the programmer to define their own data types and control over the type of data you want to introduce to the program

//The keyword new is used to instantiate a new object and is included before a call to the constructor

//After new keyword classes are called to the constructor created, this call contains the values we want to assign to the internal attributes for each object

//Each value is assigned to its respective constructor variable

//Values are listed in the same order in which they are arranged in the constructor

//The program call the toString method on each object we created

//This program allow the user to update information about existing projects

//The program allow the user to finalise existing projects.


import java.util.InputMismatchException;
import java.util.Scanner;

// The Main class declared.
public class PoisedFirmOne {

    // Main method is declared.
    public static void main(String[] args) {

// Variables are declared.		

        //Project inputs

        int projectnumber;
        String projectname;
        String typeofbuilding;
        String physicaladdress;
        String ERFNumber;
        double projectcost = 0;
        double amountpaid = 0;
        String deadline;
        
        Scanner input = new Scanner(System.in);

        //Welcome message is displayed to the user
        System.out.println("Welcome to the Poised Firm. Please create a new project.");
        

        //The user is asked to enter details about the project
        //The information is stored in variables
        //The user enters the Project Number

        while(true) {
        	try {
        		System.out.println("\nWhat is the number of the project?: ");
                projectnumber = input.nextInt();
                input.nextLine();
                break;
        	}catch(InputMismatchException e) {
        		System.out.println("Incorrect Input");
        		input.nextLine();
        		
        	}
        }
               
        //The user enters the Project Name
        System.out.println("What is the name of the project?: ");
        projectname = input.nextLine();

        //The user enters the Type of Building
        System.out.println("What type of building is the project?: ");
        typeofbuilding = input.nextLine();

        //The user enters the Physical Address of the project

        System.out.println("What is the physicaladdress of the project?: ");
        physicaladdress = input.nextLine();

        //The user enters the ERF Number of the project
        System.out.println("What is the ERFnumber of the project?: ");
        ERFNumber = input.nextLine();

        //The user enters the Cost of the Project
        while(true) {	
        	try {
            	System.out.println("How much is the cost of the project?: ");
            	projectcost = input.nextDouble();
                input.nextLine();
            	System.out.println("What is the amount paid to date?: ");
            	amountpaid = input.nextDouble();
                input.nextLine();
                break;
                
            }catch(InputMismatchException e) {
            	System.out.println("Incorrect Input"); 
            	 input.nextLine();
        	}
        	
        }
  
        //The user enters the Deadline of the project
        System.out.println("When is the deadline of the project?: ");
        deadline = input.nextLine();

        // New object("newproject") is created using the above details,
        ProjectDetailsOne newproject = new ProjectDetailsOne(projectnumber, projectname, typeofbuilding, physicaladdress, ERFNumber, projectcost, amountpaid, deadline);

        System.out.println("Your have created your project.");

        //showProjectDetails() method is in the (ProjectDetails) class called out to show the new object("createnewproject")
        System.out.println(newproject.showProjectDetails());

        while (true) {

            //The user is presented with menu options to choose from
            //These options allows the user to edit existing projects, update the contractors information and finalise the project
            System.out.println("\nChoose an option from the menu: \n" + "\n1. Edit existing projects" + "\n2. Update the contractor details" + "\n3. Enter the architect details" + "\n4. Finalise the project" + "\n5. Exit program");

            //The user's choice was stored in a variable useroption
            int useroption = input.nextInt();

            //if the user chooses option 1 from the main menu, they will be able to edit existing projects
            if (useroption == 1) {

                input.nextLine();

                //The user is presented with the menu which allows the to edit the project due date or the amount paid
                System.out.println("Which of the following options Would you like to do:" + "\n1. Edit the project due date or" + "\n2. Edit the total amount paid of the fee to date?" + "\nPlease choose either 1 or 2");

                //Their option is stored in "edituserchoice" variable
                Scanner choice = new Scanner(System.in);
                int edituserchoice = choice.nextInt();

                //if the user choose option 1 from the short menu, they are asked to enter a new due date for the project
                if (edituserchoice == 1) {
                    input.nextLine();
                    System.out.println("\nEnter the new due date for the project: ");
                    Scanner duedate = new Scanner(System.in);

                    //the updated due date is then stored in the "deadline" variable
                    deadline = duedate.nextLine();

                    //A new project with the updated due date is the created
                    ProjectDetailsOne editedproject = new ProjectDetailsOne(projectnumber, projectname, typeofbuilding, physicaladdress, ERFNumber, projectcost, amountpaid, deadline);

                    //An edited project object shown to the user in a friendly-manner
                    System.out.println(editedproject.showProjectDetails());
                }

                //If the user choose option 2 from the short menu, they are asked to update the amount paid to date
                else if (edituserchoice == 2) {
                    input.nextLine();
                    System.out.println("\nEnter the new total amount paid to date: ");
                    Scanner amount = new Scanner(System.in);

                    //The updated amount paid to date is stored in the "amountpaid" variable
                    amountpaid = amount.nextDouble();

                    //A new project with the updated amount paid is created
                    ProjectDetailsOne editedprojectone = new ProjectDetailsOne(projectnumber, projectname, typeofbuilding, physicaladdress, ERFNumber, projectcost, amountpaid, deadline);

                    //The edited project object is then displayed to the user
                    System.out.println(editedprojectone.showProjectDetails());

                }
            }
            //If the user choose option 2 from the main menu, they are asked to update the contractor's details
            //The user's inputs are stored in appropriate variables
            else if (useroption == 2) {
                input.nextLine();

                //The user enter's the name of the contractor
                System.out.println("\nEnter the contractor's name to confirm their details: ");
                Scanner nameContractor = new Scanner(System.in);
                String name = nameContractor.nextLine();

                //The user enter's the telnumbers of the contractor
                System.out.println("\nEnter the new contact number of the contractor's : ");  
                Scanner numbersContractor = new Scanner(System.in);
                int number = numbersContractor.nextInt();

                //The user enter's the email address of the contractor
                System.out.println("\nEnter the new email address of the contractor's : ");  
                Scanner emailContractor = new Scanner(System.in);
                String email = emailContractor.nextLine();

                //The user enter's the physical address of the contractor
                System.out.println("\nEnter the new physical address of the contractor's : ");  
                Scanner addressContractor = new Scanner(System.in);
                String address = addressContractor.nextLine();

                String typeofperson = "Contractor";

                //New Type of person object is created with contractor's updated details
                TypeOfPersonOne contractor = new TypeOfPersonOne(typeofperson, name, number, email, address);

                System.out.println("You have updated the contractor details. \n");

                //showTypeOfPerson() method is in the (TypeOfPerson) class called out to show the new object("contractor")
                System.out.println(contractor.showTypeOfPerson());
                

            } else if (useroption == 3) {
                input.nextLine();

                //The user enter's the name of the architect
                System.out.println("\nEnter the architect's name to confirm their details: ");
                Scanner nameArchitect = new Scanner(System.in);
                String name = nameArchitect.nextLine();

                //The user enter's the telnumbers of the architect
                System.out.println("\nEnter the new contact number of the architect's : "); 
                Scanner numbersArchitect = new Scanner(System.in);
                int number = numbersArchitect.nextInt();

                //The user enter's the email address of the architect
                System.out.println("\nEnter the new email address of the contractor's : ");  
                Scanner emailArchitect = new Scanner(System.in);
                String email = emailArchitect.nextLine();

                //The user enter's the physical address of the architect
                System.out.println("\nEnter the new physical address of the architect's : "); 
                Scanner addressAchitect = new Scanner(System.in);
                String address = addressAchitect.nextLine();

                String typeofperson = "Architect";

                //New Type of person object is created with architect's details
                TypeOfPersonOne architect = new TypeOfPersonOne(typeofperson, name, number, email, address);

                System.out.println("You have updated the contractor details. \n");

                //showTypeOfPerson() method is in the (TypeOfPerson) class called out to show the new object("architect")
                System.out.println(architect.showTypeOfPerson());
            }

            //If the user choose option 3 from the main menu, they are asked to finalise the project
            else if (useroption == 4) {
                input.nextLine();

                if (projectcost == amountpaid) {

                    //If the project amount was paid in full, no invoice will be generated
                    //The user is asked to enter the completion date of the project
                    System.out.println("No outstanding amount, the project is paid in full. No invoice.");
                    System.out.println("Add a completion date for the project: ");

                    //Completion date stored in a variable.
                    //The project is then marked "finalised"
                    Scanner date = new Scanner(System.in);
                    String completion = date.nextLine();
                    String finalise = "finalised";

                    //All the details about the project object as well as the "finalised" are printed out in a friendly-manner
                    System.out.println(newproject.showProjectDetails() + "\nCompletion Date: " + completion);
                    System.out.println("\nProject Status: " + finalise);

                    //If there is an outstanding amount
                } else if (projectcost != amountpaid) {

                    //The user is asked to add the customer's details to generate an invoice
                    //The user's inputs are stored in variables
                    System.out.println("The following details will be included in your invoice: ");

                    //The user enter's the customer name
                    //
                    System.out.println("\nEnter the full name of the customer's : ");
                    Scanner customer = new Scanner(System.in);
                    String customername = customer.nextLine();

                    String typeofperson = "Customer";

                    //The user enter's the customer's contact numbers
                    System.out.println("\nEnter the contact number of the customer's : ");
                    Scanner numbersCustomer = new Scanner(System.in);
                    int contactnumbers = numbersCustomer.nextInt();

                    //The user enter's the customers email address
                    System.out.println("\nEnter the email address of the customer's : ");
                    Scanner emailCustomer = new Scanner(System.in);
                    String emailaddress = emailCustomer.nextLine();

                    //The user enter's the customer's physical address
                    System.out.println("\nEnter the physical address of the customer's physical address: ");
                    Scanner addressCustomer = new Scanner(System.in);
                    String customeraddress = addressCustomer.nextLine();

                    //The user is asked to enter the completion date of the project
                    System.out.println("Add a completion date for the project: ");

                    //Completion date of the project is stored in a variable
                    Scanner newdate = new Scanner(System.in);
                    String completion = newdate.nextLine();  
                    String finalise = "finalised";

                    //The New type of person object is created to show the customer's details
                    TypeOfPersonOne newcustomer = new TypeOfPersonOne(typeofperson, customername, contactnumbers, emailaddress, customeraddress);
                    System.out.println("\nBelow are the customer's invoice details: ");

                    //The invoice with the customer's details and the outstanding amount is printed out
                    System.out.println(newcustomer.showTypeOfPerson());
                    System.out.println("\nOutstanding Amount: R" + (projectcost - amountpaid) + "\n");

                    //All the details about the project, including the completion date are printed out
                    System.out.println(newproject.showProjectDetails() + "\nCompletion Date: " + completion);
                    System.out.println("Project Status: " + finalise);

                }

            }

            //If the user choose option 4 from the main menu, they will log out from the program
            if (useroption == 5) {
                input.nextLine();
                System.out.println("You have logged out.");
                break;
            }
        }

    }

}
