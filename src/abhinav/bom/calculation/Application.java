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
                i.getDefaultInventory();
                break;
            case 2:
                i.enterMaterialsAvailable();
                break;
            default:
                System.out.println("Enter the valid value.");
                System.exit(0);
                break;
        }



        System.out.print("Enter the number of cycles to manufacture : ");
        int noOfCycles= Integer.parseInt(br.readLine());
        System.out.println("\n");
        i.generateMaterialsRequired(noOfCycles);

        i.calculateNetMaterialsRequired();
    }

}
