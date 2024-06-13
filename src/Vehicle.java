public class Vehicle {
    public void parameters( String name){
        System.out.println(name);
    }
    public void parameters( String name, int speed) {
        System.out.println(name + "can go upto the speed " + 120);
    }
    public void parameters( String name, int speed , String engineType) {
        System.out.println(name + "can go upto the speed " + 120 + " and has the engine " + engineType);
    }
}

