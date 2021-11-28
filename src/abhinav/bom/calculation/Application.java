package abhinav.bom.calculation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application
{
    public static void main(String[] args) throws Exception{
        System.out.println("Press the key according to options given");
        Inventory i = new Inventory();
        System.out.println("1 . To proceed with available Inventory");
        System.out.println("2 . To enter Inventory and proceed");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Your option : ");
        int c=Integer.parseInt(br.readLine());
        switch(c)
        {
            case 1:
                i.getDefaultInventory(); // option to proceed with the default inventory values in the pdf
                break;
            case 2:
                i.enterMaterialsAvailable();// option to enter inventory values during runtime
                break;
            default:
                System.out.println("Enter the valid value.");
                System.exit(0);
                break;
        }

        System.out.print("Enter the number of cycles to manufacture : ");
        int noOfCycles= Integer.parseInt(br.readLine());  //taking input for number of cycles to manufacture
        System.out.println("\n");
        i.generateMaterialsRequired(noOfCycles);  //calculating the number of each component required

        i.calculateNetMaterialsRequired();  //calculating the extra components that needs to be purchased.
    }

}
