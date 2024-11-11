public class Rezervor {
    private int maxCapacity;
    private int currentCapacity;

    public Rezervor(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public Rezervor(){
        this(100, 50);
    }

    public void fillGasTank(int level){
        if(level < maxCapacity){
            currentCapacity = level;
        }
        else {
            currentCapacity = maxCapacity;
        }
    }
    //supraincarcare in subclasa ex toString

    //immostenire - suprainscriere
    public void fillGasTank(int level, int additionalLevel){
        int sum = level + additionalLevel;
        if(sum < maxCapacity && sum >= currentCapacity){
            currentCapacity = sum;
        }
        else {
            currentCapacity = maxCapacity;
        }
    }

    public void emptyGasTank(int usedFuel){
        currentCapacity -= usedFuel;
    }
    public int getCurrentCapacity(){
        return currentCapacity;
    }
    public int getMaxCapacity(){
        return maxCapacity;
    }

}
