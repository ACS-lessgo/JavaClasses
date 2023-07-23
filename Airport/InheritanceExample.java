package airport;

public class InheritanceExample {
	public static void main(String[] args) {
		RobotGen3  robo = new RobotGen3();
		robo.climb();
		robo.power(10);
		robo.show();
	}
}


class RobotGen1{
	int proccessorCoreCount;
	void walk() {
		System.out.println("This robot can only walk");
	}
	void power(int proccessorCoreCount) {
		this.proccessorCoreCount=proccessorCoreCount;
	}
	void show() {
		System.out.println("The robots computaional power is  "+proccessorCoreCount+"/10");
	}
	
}

class RobotGen2 extends RobotGen1{
	void run() {
		System.out.println("This robot can walk and run");
	}
	void ai() {
		System.out.println("This robot has self thinking capabilities");
	}
}

class RobotGen3 extends RobotGen2{
	void climb() {
		System.out.println("This robot can walk , run and climb");
	}
	void objectDetection() {
		System.out.println("This robot can detect objects");
	}
}