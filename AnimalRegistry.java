public class AnimalRegistry{
    private Sheep sheepPrototype; 
    private Cow cowPrototype; 
    private Horse horsePrototype; 

    public AnimalRegistry(){
        sheepPrototype = new Sheep(); 
        cowPrototype = new Cow(); 
        horsePrototype = new Horse(); 
    }
    public Animal createSheep(){
        return sheepPrototype;
    }
    public Animal createCow(){
        return cowPrototype; 
    }
    public Animal createHorse(){
        return horsePrototype; 
    }
}