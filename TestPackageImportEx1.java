package tw.leonchen.myproject.oop;

public class TestPackageImportEx1 {
	
	int speed = 50;
	
    public void speedUp(int speed){
    	this.speed = speed + 10;
    }
    
    public void speedDown(int speed){
    	this.speed = speed - 10;
    }
    
    public void showInfo(){
    	System.out.println("Speed:" + speed);
    }
}
