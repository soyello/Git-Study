import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJAVAGoInHome {

	public static void main(String[] args) {
		
		String id = "HanNamDong Villa";
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting floorLamp = new Lighting(id+ "/ floor Lamp");
		floorLamp.on();
		
		Lighting HallLamp = new Lighting(id+ "/ Hall Lamp");
		HallLamp.on();
	}

}
