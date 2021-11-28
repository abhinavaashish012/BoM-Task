package abhinav.bom.calculation;

public class Cycle
{
    private int requiredseats;
    private int requiredframes;
    private int requiredbrakeSet;
    private int requiredbrakePaddles;
    private int requiredbrakeCables;
    private int requiredlevers;
    private int requiredbrakeShoes;
    private int requiredhandleBars;
    private int requiredwheels;
    private int requiredtires;
    private int requiredchains;
    private int requiredcrankSet;
    private int requiredpaddles;


    //argument constructor for Cycle
    public Cycle(int requiredseats, int requiredframes, int requiredbrakeSet, int requiredbrakePaddles, int requiredbrakeCables,
                 int requiredlevers, int requiredbrakeShoes, int requiredhandleBars, int requiredwheels, int requiredtires,
                 int requiredchains, int requiredcrankSet, int requiredpaddles)
    {
        this.requiredseats = requiredseats;
        this.requiredframes = requiredframes;
        this.requiredbrakeSet = requiredbrakeSet;
        this.requiredbrakePaddles = requiredbrakePaddles;
        this.requiredbrakeCables = requiredbrakeCables;
        this.requiredlevers = requiredlevers;
        this.requiredbrakeShoes = requiredbrakeShoes;
        this.requiredhandleBars = requiredhandleBars;
        this.requiredwheels = requiredwheels;
        this.requiredtires = requiredtires;
        this.requiredchains = requiredchains;
        this.requiredcrankSet = requiredcrankSet;
        this.requiredpaddles = requiredpaddles;
    }

    //setters and getters for the member variables
    public int getRequiredseats() {
        return requiredseats;
    }

    public void setRequiredseats(int requiredseats) {
        this.requiredseats = requiredseats;
    }

    public int getRequiredframes() {
        return requiredframes;
    }

    public void setRequiredframes(int requiredframes) {
        this.requiredframes = requiredframes;
    }

    public int getRequiredbrakeSet() {
        return requiredbrakeSet;
    }

    public void setRequiredbrakeSet(int requiredbrakeSet) {
        this.requiredbrakeSet = requiredbrakeSet;
    }

    public int getRequiredbrakePaddles() {
        return requiredbrakePaddles;
    }

    public void setRequiredbrakePaddles(int requiredbrakePaddles) {
        this.requiredbrakePaddles = requiredbrakePaddles;
    }

    public int getRequiredbrakeCables() {
        return requiredbrakeCables;
    }

    public void setRequiredbrakeCables(int requiredbrakeCables) {
        this.requiredbrakeCables = requiredbrakeCables;
    }

    public int getRequiredlevers() {
        return requiredlevers;
    }

    public void setRequiredlevers(int requiredlevers) {
        this.requiredlevers = requiredlevers;
    }

    public int getRequiredbrakeShoes() {
        return requiredbrakeShoes;
    }

    public void setRequiredbrakeShoes(int requiredbrakeShoes) {
        this.requiredbrakeShoes = requiredbrakeShoes;
    }

    public int getRequiredhandleBars() {
        return requiredhandleBars;
    }

    public void setRequiredhandleBars(int requiredhandleBars) {
        this.requiredhandleBars = requiredhandleBars;
    }

    public int getRequiredwheels() {
        return requiredwheels;
    }

    public void setRequiredwheels(int requiredwheels) {
        this.requiredwheels = requiredwheels;
    }

    public int getRequiredtires() {
        return requiredtires;
    }

    public void setRequiredtires(int requiredtires) {
        this.requiredtires = requiredtires;
    }

    public int getRequiredchains() {
        return requiredchains;
    }

    public void setRequiredchains(int requiredchains) {
        this.requiredchains = requiredchains;
    }

    public int getRequiredcrankSet() {
        return requiredcrankSet;
    }

    public void setRequiredcrankSet(int requiredcrankSet) {
        this.requiredcrankSet = requiredcrankSet;
    }

    public int getRequiredpaddles() {
        return requiredpaddles;
    }

    public void setRequiredpaddles(int requiredpaddles) {
        this.requiredpaddles = requiredpaddles;
    }
}
