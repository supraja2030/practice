public class Vehicle7 {
    String name;
    int speed;
    String engine;
    double cost;
    Vehicle7(String name, int speed, String engine, double cost){
        this.name = name;
        this.speed = speed;
        this.engine = engine;
        this.cost = cost;
    }
    void stop(){
        System.out.println(this.name + " has been stopped");
    }
    void speed(){
        System.out.println(this.speed  + " is the speed of the vehicle");
    }
    void engine (){
        System.out.println(this.engine + " is the engine type in the car ");
    }
    void cost(){
        System.out.println(this.cost + "$ is the cost of the vehicle");
    }
}
