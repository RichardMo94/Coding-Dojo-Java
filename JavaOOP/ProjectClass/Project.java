public class Project{
    private String name;
    private String description;
    private String pitch;
    private int cost;
 

    public String elevatorPitch(){
        return this.name + " $" +this.cost + " : " + this.description;
    }

    // Constructor
    public Project(){
        this.name = "default";
        this.description = "default";
        this.pitch = elevatorPitch();
        this.cost = 0;
    }

    public Project(String name, String description, int cost){
        this.name = name;
        this.description =  description;
        this.cost = cost;
    }

    // Setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setCost(int newCost){
        this.cost = newCost;
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getCost(){
        return this.cost;
    }
}