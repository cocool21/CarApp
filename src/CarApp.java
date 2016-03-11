import java.util.Random;
public class CarApp {
	public static void main(String[] args) {
		Random rnd=new Random();
		Car red=new Car("Red Porsche");
		Car blue=new Car("Blue Jetta");
		red.setSpeed(rnd.nextInt(50));
		blue.setSpeed(rnd.nextInt(50));
		
		while(red.getSpeed()!=0||blue.getSpeed()!=0){
		
		System.out.println(red.Accelerate());
		System.out.println(blue.Accelerate());
		
		System.out.println(red.Run());
		System.out.println(blue.Run());
		
		if(blue.getSpeed()>red.getSpeed()){
			System.out.println(blue.getName()+" has just passed "+red.getName());
		}else if(blue.getSpeed()==red.getSpeed()){
			System.out.println(blue.getName()+" runs with "+red.getName());
		}else{
			System.out.println(red.getName()+" has just passed "+blue.getName());
		}
		
		red.setSpeed(rnd.nextInt(50));
		blue.setSpeed(rnd.nextInt(50));
		
		}
		
		System.out.println(red.Run());
		System.out.println(blue.Run());
		System.out.println(red.Stop());
		System.out.println(blue.Stop());
	
}
}
