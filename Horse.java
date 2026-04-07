public class Horse implements Animal{
    private Integer legs; 
    private String sound; 
    private String food; 
    private String color; 

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getColor() {
        return color; 
    }

    public void setColor(String color){
        this.color= color; 
    }


    @Override
    public void makeSound(){
        System.out.print("Neigh"); 
    }
     
    @Override
    public Animal clone(){
        return new Horse(); 
    }
    @Override
    public String getType(){
        return "Horse"; 
    }
}