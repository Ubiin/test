import java.util.*;

public class Calculation_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("뺄셈할 숫자 두개를 아주 빠르게 입력하세요.");
		x = scan.nextFloat();
		y = scan.nextFloat();
		Sub_cal sub = new Sub_cal(x,y);
		
		System.out.println(sub.Ans_print());
		
	}

}
