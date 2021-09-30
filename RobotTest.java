package Constructor;

public class RobotTest {
 
		public static void main (String[]args) {
			Robot sophia=new Robot(688888,"NFT","sophia","2016s","hanson robotics","metal","AI");
			
			System.out.println();
			sophia.switchOnOff();
			System.out.println();
			sophia.displayInfo();		}
}
