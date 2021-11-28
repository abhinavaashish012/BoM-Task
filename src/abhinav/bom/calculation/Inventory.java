package abhinav.bom.calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory
{
    Map<String,Integer> invList=new HashMap<>();;
    Map<String,Integer> reqList=new HashMap<>();;

    private int seats;
    private int frames;
    private int brakeSet;
    private int brakePaddles;
    private int brakeCables;
    private int levers;
    private int brakeShoes;
    private int handleBars;
    private int wheels;
    private int tires;
    private int chains;
    private int crankSet;
    private int paddles;

    public void getDefaultInventory()
    {
        this.seats=50;
        this.frames=80;
        this.brakeSet=25;
        this.brakePaddles=100;
        this.brakeCables=75;
        this.levers=60;
        this.brakeShoes=150;
        this.handleBars=100;
        this.wheels=60;
        this.tires=80;
        this.chains=100;
        this.crankSet=50;
        this.paddles=150;


        //invList = new HashMap<>();
        invList.put("seats",this.seats);
        invList.put("frames",this.frames);
        invList.put("brakeSet",this.brakeSet);
        invList.put("brakePaddles",this.brakePaddles);
        invList.put("brakeCables",this.brakeCables);
        invList.put("levers",this.levers);
        invList.put("brakeShoes",this.brakeShoes);
        invList.put("handleBars",this.handleBars);
        invList.put("wheels",this.wheels);
        invList.put("tires",this.tires);
        invList.put("chains",this.chains);
        invList.put("crankSet",this.crankSet);
        invList.put("paddles",this.paddles);

//        System.out.println("The total available inventory is as follows : ");
//        for(Map.Entry<String,Integer> e : invList.entrySet())
//            System.out.println(e);
    }

    public void enterMaterialsAvailable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of seats available : ");
        int x= Integer.parseInt(br.readLine());
        this.seats=x;

        System.out.print("Enter the number of frames available : ");
        x= Integer.parseInt(br.readLine());
        this.frames=x;

        System.out.print("Enter the number of brakeSet available : ");
        x= Integer.parseInt(br.readLine());
        this.brakeSet=x;

        System.out.print("Enter the number of brakePaddles available : ");
        x= Integer.parseInt(br.readLine());
        this.brakePaddles=x;

        System.out.print("Enter the number of brakeCables available : ");
        x= Integer.parseInt(br.readLine());
        this.brakeCables=x;

        System.out.print("Enter the number of levers available : ");
        x= Integer.parseInt(br.readLine());
        this.levers=x;

        System.out.print("Enter the number of brakeShoes available : ");
        x= Integer.parseInt(br.readLine());
        this.brakeShoes=x;

        System.out.print("Enter the number of handleBars available : ");
        x= Integer.parseInt(br.readLine());
        this.handleBars=x;

        System.out.print("Enter the number of wheels available : ");
        x= Integer.parseInt(br.readLine());
        this.wheels=x;

        System.out.print("Enter the number of tires available : ");
        x= Integer.parseInt(br.readLine());
        this.tires=x;

        System.out.print("Enter the number of chains available : ");
        x= Integer.parseInt(br.readLine());
        this.chains=x;

        System.out.print("Enter the number of crankSet available : ");
        x= Integer.parseInt(br.readLine());
        this.crankSet=x;

        System.out.print("Enter the number of paddles available : ");
        x= Integer.parseInt(br.readLine());
        this.paddles=x;


        //invList = new HashMap<>();
        invList.put("seats",this.seats);
        invList.put("frames",this.frames);
        invList.put("brakeSet",this.brakeSet);
        invList.put("brakePaddles",this.brakePaddles);
        invList.put("brakeCables",this.brakeCables);
        invList.put("levers",this.levers);
        invList.put("brakeShoes",this.brakeShoes);
        invList.put("handleBars",this.handleBars);
        invList.put("wheels",this.wheels);
        invList.put("tires",this.tires);
        invList.put("chains",this.chains);
        invList.put("crankSet",this.crankSet);
        invList.put("paddles",this.paddles);

//        System.out.println("The total available inventory is as follows : ");
//        for(Map.Entry<String,Integer> e : invList.entrySet())
//            System.out.println(e);

    }
    public void generateMaterialsRequired(int noOfCycles)
    {
        //reqList = new HashMap<>();
        reqList.put("seats",noOfCycles*1);
        reqList.put("frames",noOfCycles*1);
        reqList.put("brakeSet",noOfCycles*2);
        reqList.put("brakePaddles",noOfCycles*1);
        reqList.put("brakeCables",noOfCycles*1);
        reqList.put("levers",noOfCycles*1);
        reqList.put("brakeShoes",noOfCycles*2);
        reqList.put("handleBars",noOfCycles*1);
        reqList.put("wheels",noOfCycles*2);
        reqList.put("tires",noOfCycles*2);
        reqList.put("chains",noOfCycles*1);
        reqList.put("crankSet",noOfCycles*1);
        reqList.put("paddles",noOfCycles*2);

//        System.out.println("The total required inventory is as follows : ");
//        for(Map.Entry<String,Integer> e : reqList.entrySet())
//            System.out.println(e);
    }

    public void calculateNetMaterialsRequired()
    {
        Iterator<Map.Entry<String, Integer>> itr1 =invList.entrySet().iterator();

        Iterator<Map.Entry<String, Integer>> itr2 =reqList.entrySet().iterator();

        System.out.println("The extra materials reequired are as follows: ");

        while (itr1.hasNext() && itr2.hasNext()) {
            Map.Entry avlblItem = (Map.Entry)itr1.next();
            int avlblVal = (int)avlblItem.getValue();

            Map.Entry reqItem = (Map.Entry)itr2.next();
            int reqVal = (int)reqItem.getValue();

            System.out.println(reqItem.getKey()+ " = "+(reqVal-avlblVal));

        }


    }
}
