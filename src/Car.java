public class Car extends Vehicle1{
    @Override
    public void parameters(String name, int speed , String engineType){
        System.out.println(name+ " can go speed " + speed + " and has engine type ");
    }
}
