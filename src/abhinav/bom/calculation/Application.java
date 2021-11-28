package abhinav.bom.calculation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application
{
    public static void main(String[] args) throws Exception{
        System.out.println("hello");
        Inventory i = new Inventory();
        i.getDefaultInventory();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of cycles to manufacture : ");
        int noOfCycles= Integer.parseInt(br.readLine());
        System.out.println("\n");
        i.generateMaterialsRequired(noOfCycles);

        i.calculateNetMaterialsRequired();
    }

}
