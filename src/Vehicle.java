public abstract class Vehicle { 
private int speed=10;
private String name="";
public Vehicle(){
	
}
public Vehicle(String value){
	this.name=value;
}
public String getName(){
	return name;
}

public void setSpeed(int value){
	this.speed=value;
}
public int getSpeed(){
	return speed;
}
public String Run() {
   return name+" is running at "+speed+"mph";
}

public String Stop() {
    return name+" has stopped";
}

public String Accelerate() {
    return name+ " is accelerating";
}


}