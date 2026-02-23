public class Cat {
    private String name;
    private int numOfleg;
    private boolean isMale;

    //Constructor
    public Cat(String name, int numOfleg, boolean isMale){
        this.name = name;
        this.numOfleg = numOfleg;
        this.isMale = isMale;
    }

    public String getName(){
        return name;
    }

    public int getNumOfleg(){
        return numOfleg;
    }

    public boolean isMale(){
        return isMale;
    }

    public void setName(String mula){
        this.name = mula;
    }

}
