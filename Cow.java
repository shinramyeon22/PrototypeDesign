public class Cow implements Animal{
    private Integer legs; 
    private String sound; 
    private String food; 
    
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

    @Override
    public void makeSound(){
        System.out.print("Moo"); 
    }
     
    @Override
    public Animal clone(){
        return new Cow(); 
    }
    @Override
    public String getType(){
        return "Cow"; 
    }
}