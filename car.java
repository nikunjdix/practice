import java.util.concurrent.ThreadLocalRandom;

class Car { //class
    private String make;
    private String model;
    private int year;
    private int speed;

    public Car(String make, String model, int year){  //constructor will use class name
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
// this tells you that it is a part of THIS class
    }

    public Car(String make, String model, int year, int speed){
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;

    }

    public void printInfo(){   //method will not have class name
        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }

    public int getSpeed(){
        return this.speed;
    }

    public int setSpeed(int speed){
        this.speed = speed;
        return this.speed;
    }

    public int increaseSpeed(){
        this.speed += 5;
        return this.speed;
    }
    
    public int decreaseSpeed(){
        this.speed -= 5;
        return this.speed;
    }

    public int increaseSpeed(int addedSpeed){
        this.speed += addedSpeed;
        return this.speed;
    }

    public int decreaseSpeed(int reducedSpeed){
        this.speed -= reducedSpeed;
        return this.speed;
    }

    public void printSpeed(){
        System.out.println(this.speed);
    }

}

class Program {
    public static void main (String[] args) { // execution
        // Car hondaAccord = new Car("Honda", "Accord", 2016, 25);
        
        // Car hondaPilot = new Car("Honda", "Pilot", 2018);

        
        // System.out.println(hondaAccord.getSpeed());
        // System.out.println(hondaPilot.getSpeed());

        Factory america = new Factory("USA");

        Car hondaAccord = america.produceCar();

        // hondaAccord.printSpeed();
        // hondaAccord.increaseSpeed(7);
        // hondaAccord.printSpeed();
        // hondaAccord.decreaseSpeed(10);
        // hondaAccord.printSpeed();
        hondaAccord.printInfo();
    }

}


class Factory{
    private String country;
    public Factory(String country){
        this.country = country;
    }

    public Car produceCar(){
        int randomYear = ThreadLocalRandom.current().nextInt(2010, 2020+1);
        Car hondaAccord = new Car("Honda", "Accord", randomYear, 3);
        return hondaAccord;
    }
}



