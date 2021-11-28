package abhinav.bom.calculation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application
{
    public static void main(String[] args) throws Exception{
        Inventory inventory = new Inventory();

        //showing options to user
        System.out.println("Press the key according to options given\n1 . To proceed with available Inventory \n" +
                "2 . To enter Inventory and proceed");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String userInput;   // to capture user-input from the keyboard for the components
        int userChoice;        // to convert the captured user input into its corresponding integer value
        int noOfCycles;        // to capture the number of cycles


        //capturing user choice until a valid value is obtained
        do {
            System.out.print("Your option : ");
            userInput=br.readLine();
            if(Validator.validate(userInput)) {
                userChoice = Integer.parseInt(userInput);
                switch(userChoice)
                {
                    case 1:
                        inventory.getDefaultInventory(); // option to proceed with the default inventory values in the pdf
                        break;
                    case 2:
                        inventory.enterMaterialsAvailable();// option to enter inventory values during runtime
                        break;
                    default:
                        userInput="invalid";
                }
            }
        }while(!Validator.validate(userInput));



        //capturing the number of cycles until a valid number is entered
        do {
            System.out.print("Enter the number of cycles to manufacture : ");
            userInput=br.readLine();
            if(Validator.validate(userInput)) {
                noOfCycles = Integer.parseInt(userInput);  //taking input for number of cycles to manufacture
                inventory.generateMaterialsRequired(noOfCycles); //calculating the number of each component required
            }
        }while(!Validator.validate(userInput));

        //calculating the extra components that needs to be purchased
        inventory.calculateNetMaterialsRequired();
    }

}
