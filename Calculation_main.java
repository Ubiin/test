package yubin;
import java.util.*;

public class Calculation_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("»¬¼ÀÀ» ÇÒ µÎ ¼ö ÀÔ·Â.");
		x = scan.nextFloat();
		y = scan.nextFloat();
		Sub_cal sub = new Sub_cal(x,y);
		
		System.out.println(sub.Ans_print());
		
	}

}
