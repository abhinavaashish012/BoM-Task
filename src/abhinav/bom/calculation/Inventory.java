package abhinav.bom.calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory
{
    HashMap<String,Integer> invList;
    HashMap<String,Integer> reqList;

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

    private HashMap<String,Integer> generateList(Inventory inventory, int cycles) {

        HashMap<String,Integer> myList = new HashMap<>();

        myList.put("seats",this.getSeats()*cycles);
        myList.put("frames",this.getFrames()*cycles);
        myList.put("brakeSet",this.getBrakeSet()*cycles);
        myList.put("brakePaddles",this.getBrakePaddles()*cycles);
        myList.put("brakeCables",this.getBrakeCables()*cycles);
        myList.put("levers",this.getLevers()*cycles);
        myList.put("brakeShoes",this.getBrakeShoes()*cycles);
        myList.put("handleBars",this.getHandleBars()*cycles);
        myList.put("wheels",this.getWheels()*cycles);
        myList.put("tires",this.getTires()*cycles);
        myList.put("chains",this.getChains()*cycles);
        myList.put("crankSet",this.getCrankSet()*cycles);
        myList.put("paddles",this.getPaddles()*cycles);

        //System.out.println("The total available inventory is as follows : ");
        for(Map.Entry<String,Integer> e : myList.entrySet())
            System.out.println(e);
        System.out.println("##########################################################");
        return myList;
    }


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

        System.out.println("The total available inventory is as follows : ");
        invList = generateList(this,1);

    }


    // to enter the inventory values during runtime
    public void enterMaterialsAvailable() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String userInput="";
        int userIntInput;

        System.out.print("Enter the number of seats available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setSeats(userIntInput);
        }
        else
            this.setSeats(50);



        System.out.print("Enter the number of frames available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setFrames(userIntInput);
        }
        else
            this.setFrames(80);


        System.out.print("Enter the number of brakeSet available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setBrakeSet(userIntInput);
        }
        else
            this.setBrakeSet(25);



        System.out.print("Enter the number of brakePaddles available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setBrakePaddles(userIntInput);
        }
        else
            this.setBrakePaddles(100);



        System.out.print("Enter the number of brakeCables available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setBrakeCables(userIntInput);
        }
        else
            this.setBrakeCables(75);



        System.out.print("Enter the number of levers available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setLevers(userIntInput);
        }
        else
            this.setLevers(60);



        System.out.print("Enter the number of brakeShoes available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setBrakeShoes(userIntInput);
        }
        else
            this.setBrakeShoes(150);



        System.out.print("Enter the number of handleBars available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setHandleBars(userIntInput);
        }
        else
            this.setHandleBars(100);



        System.out.print("Enter the number of wheels available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setWheels(userIntInput);
        }
        else
            this.setWheels(60);



        System.out.print("Enter the number of tires available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setTires(userIntInput);
        }
        else
            this.setTires(80);



        System.out.print("Enter the number of chains available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setChains(userIntInput);
        }
        else
            this.setChains(100);



        System.out.print("Enter the number of crankSet available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setCrankSet(userIntInput);
        }
        else
            this.setCrankSet(50);



        System.out.print("Enter the number of paddles available : ");
        userInput=br.readLine();
        if(Validator.validate(userInput)) {
            userIntInput = Integer.parseInt(userInput);
            this.setPaddles(userIntInput);
        }
        else
            this.setPaddles(150);

        System.out.println("The total available inventory is as follows : ");
        invList = generateList(this,1);

    }




    //calculating the number of each component required
    public void generateMaterialsRequired(int noOfCycles)
    {
        reqList= new HashMap<String,Integer>();

        reqList.put("seats",c.getRequiredseats()*noOfCycles);
        reqList.put("frames",c.getRequiredframes()*noOfCycles);
        reqList.put("brakeSet",c.getRequiredbrakeSet()*noOfCycles);
        reqList.put("brakePaddles",c.getRequiredbrakePaddles()*noOfCycles);
        reqList.put("brakeCables",c.getRequiredbrakeCables()*noOfCycles);
        reqList.put("levers",c.getRequiredlevers()*noOfCycles);
        reqList.put("brakeShoes",c.getRequiredbrakeShoes()*noOfCycles);
        reqList.put("handleBars",c.getRequiredhandleBars()*noOfCycles);
        reqList.put("wheels",c.getRequiredwheels()*noOfCycles);
        reqList.put("tires",c.getRequiredtires()*noOfCycles);
        reqList.put("chains",c.getRequiredchains()*noOfCycles);
        reqList.put("crankSet",c.getRequiredcrankSet()*noOfCycles);
        reqList.put("paddles",c.getRequiredpaddles()*noOfCycles);


        System.out.println("The required inventory is as follows : ");
        for(Map.Entry<String,Integer> e : reqList.entrySet())
            System.out.println(e);
        System.out.println("##########################################################");
    }

    //calculating the extra components needed
    public void calculateNetMaterialsRequired()
    {
        Iterator<Map.Entry<String, Integer>> itr1 =this.invList.entrySet().iterator();
        Iterator<Map.Entry<String, Integer>> itr2 =this.reqList.entrySet().iterator();

        System.out.println("The extra materials required are as follows: ");
        while (itr1.hasNext() && itr2.hasNext())
        {
            Map.Entry<String, Integer> avlblItem = itr1.next();
            int avlblVal = (int)avlblItem.getValue();

            Map.Entry<String, Integer> reqItem = itr2.next();
            int reqVal = (int)reqItem.getValue();

            if(reqVal-avlblVal>0)
                System.out.println(reqItem.getKey()+ " = "+(reqVal-avlblVal));
        }
        System.out.println("##########################################################");
    }
}
