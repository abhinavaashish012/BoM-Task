package abhinav.bom.calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory
{
    Map<String,Integer> invList;
    Map<String,Integer> reqList;

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


    //setters for the member variables
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }

    public void setBrakeSet(int brakeSet) {
        this.brakeSet = brakeSet;
    }

    public void setBrakePaddles(int brakePaddles) {
        this.brakePaddles = brakePaddles;
    }

    public void setBrakeCables(int brakeCables) {
        this.brakeCables = brakeCables;
    }

    public void setLevers(int levers) {
        this.levers = levers;
    }

    public void setBrakeShoes(int brakeShoes) {
        this.brakeShoes = brakeShoes;
    }

    public void setHandleBars(int handleBars) {
        this.handleBars = handleBars;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public void setChains(int chains) {
        this.chains = chains;
    }

    public void setCrankSet(int crankSet) {
        this.crankSet = crankSet;
    }

    public void setPaddles(int paddles) {
        this.paddles = paddles;
    }


    //getters for the member variables
    public int getSeats() {
        return seats;
    }

    public int getFrames() {
        return frames;
    }

    public int getBrakeSet() {
        return brakeSet;
    }

    public int getBrakePaddles() {
        return brakePaddles;
    }

    public int getBrakeCables() {
        return brakeCables;
    }

    public int getLevers() {
        return levers;
    }

    public int getBrakeShoes() {
        return brakeShoes;
    }

    public int getHandleBars() {
        return handleBars;
    }

    public int getWheels() {
        return wheels;
    }

    public int getTires() {
        return tires;
    }

    public int getChains() {
        return chains;
    }

    public int getCrankSet() {
        return crankSet;
    }

    public int getPaddles() {
        return paddles;
    }


    //creating cycle object with deafult parameters
    Cycle c = new Cycle(1,2,2,1,1,1,2,
            1,2,2,1,1,2);


    //default inventory values provided in the pdf
    public void getDefaultInventory()
    {
        this.setSeats(50);
        this.setFrames(80);
        this.setBrakeSet(25);
        this.setBrakePaddles(100);
        this.setBrakeCables(75);
        this.setLevers(60);
        this.setBrakeShoes(150);
        this.setHandleBars(100);
        this.setWheels(60);
        this.setTires(80);
        this.setChains(100);
        this.setCrankSet(50);
        this.setPaddles(150);


        invList = new HashMap<>();
        invList.put("seats",this.getSeats());
        invList.put("frames",this.getFrames());
        invList.put("brakeSet",this.getBrakeSet());
        invList.put("brakePaddles",this.getBrakePaddles());
        invList.put("brakeCables",this.getBrakeCables());
        invList.put("levers",this.getLevers());
        invList.put("brakeShoes",this.getBrakeShoes());
        invList.put("handleBars",this.getHandleBars());
        invList.put("wheels",this.getWheels());
        invList.put("tires",this.getTires());
        invList.put("chains",this.getChains());
        invList.put("crankSet",this.getCrankSet());
        invList.put("paddles",this.getPaddles());

        System.out.println("The total available inventory is as follows : ");
        for(Map.Entry<String,Integer> e : invList.entrySet())
            System.out.println(e);
    }

    // to enter the inventory values during runtime
    public void enterMaterialsAvailable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of seats available : ");
        int x= Integer.parseInt(br.readLine());
        this.setSeats(x);

        System.out.print("Enter the number of frames available : ");
        x= Integer.parseInt(br.readLine());
        this.setFrames(x);

        System.out.print("Enter the number of brakeSet available : ");
        x= Integer.parseInt(br.readLine());
        this.setBrakeSet(x);

        System.out.print("Enter the number of brakePaddles available : ");
        x= Integer.parseInt(br.readLine());
        this.setBrakePaddles(x);

        System.out.print("Enter the number of brakeCables available : ");
        x= Integer.parseInt(br.readLine());
        this.setBrakeCables(x);

        System.out.print("Enter the number of levers available : ");
        x= Integer.parseInt(br.readLine());
        this.setLevers(x);

        System.out.print("Enter the number of brakeShoes available : ");
        x= Integer.parseInt(br.readLine());
        this.setBrakeShoes(x);

        System.out.print("Enter the number of handleBars available : ");
        x= Integer.parseInt(br.readLine());
        this.setHandleBars(x);

        System.out.print("Enter the number of wheels available : ");
        x= Integer.parseInt(br.readLine());
        this.setWheels(x);

        System.out.print("Enter the number of tires available : ");
        x= Integer.parseInt(br.readLine());
        this.setTires(x);

        System.out.print("Enter the number of chains available : ");
        x= Integer.parseInt(br.readLine());
        this.setChains(x);

        System.out.print("Enter the number of crankSet available : ");
        x= Integer.parseInt(br.readLine());
        this.setCrankSet(x);

        System.out.print("Enter the number of paddles available : ");
        x= Integer.parseInt(br.readLine());
        this.setPaddles(x);


        invList = new HashMap<>();
        invList.put("seats",this.getSeats());
        invList.put("frames",this.getFrames());
        invList.put("brakeSet",this.getBrakeSet());
        invList.put("brakePaddles",this.getBrakePaddles());
        invList.put("brakeCables",this.getBrakeCables());
        invList.put("levers",this.getLevers());
        invList.put("brakeShoes",this.getBrakeShoes());
        invList.put("handleBars",this.getHandleBars());
        invList.put("wheels",this.getWheels());
        invList.put("tires",this.getTires());
        invList.put("chains",this.getChains());
        invList.put("crankSet",this.getCrankSet());
        invList.put("paddles",this.getPaddles());

        System.out.println("The total available inventory is as follows : ");
        for(Map.Entry<String,Integer> e : invList.entrySet())
            System.out.println(e);
    }


    //calculating the number of each component required
    public void generateMaterialsRequired(int noOfCycles)
    {
        reqList = new HashMap<>();
        reqList.put("seats",noOfCycles*c.getRequiredseats());
        reqList.put("frames",noOfCycles*c.getRequiredframes());
        reqList.put("brakeSet",noOfCycles*c.getRequiredbrakeSet());
        reqList.put("brakePaddles",noOfCycles*c.getRequiredbrakePaddles());
        reqList.put("brakeCables",noOfCycles*c.getRequiredbrakeCables());
        reqList.put("levers",noOfCycles*c.getRequiredlevers());
        reqList.put("brakeShoes",noOfCycles*c.getRequiredbrakeShoes());
        reqList.put("handleBars",noOfCycles*c.getRequiredhandleBars());
        reqList.put("wheels",noOfCycles*c.getRequiredwheels());
        reqList.put("tires",noOfCycles*c.getRequiredtires());
        reqList.put("chains",noOfCycles*c.getRequiredchains());
        reqList.put("crankSet",noOfCycles*c.getRequiredcrankSet());
        reqList.put("paddles",noOfCycles*c.getRequiredpaddles());

        System.out.println("The required inventory is as follows : ");
        for(Map.Entry<String,Integer> e : reqList.entrySet())
            System.out.println(e);
    }

    //calculating the extra components needed
    public void calculateNetMaterialsRequired()
    {
        Iterator<Map.Entry<String, Integer>> itr1 =invList.entrySet().iterator();
        Iterator<Map.Entry<String, Integer>> itr2 =reqList.entrySet().iterator();

        System.out.println("The extra materials required are as follows: ");
        while (itr1.hasNext() && itr2.hasNext())
        {
            Map.Entry avlblItem = (Map.Entry)itr1.next();
            int avlblVal = (int)avlblItem.getValue();

            Map.Entry reqItem = (Map.Entry)itr2.next();
            int reqVal = (int)reqItem.getValue();

            if(reqVal-avlblVal>0)
                System.out.println(reqItem.getKey()+ " = "+(reqVal-avlblVal));
        }
    }
}
