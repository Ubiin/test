import java.util.*;

public class Calculation_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y;
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
		System.out.println("뺄셈을 할 두 수 입력.");
=======
		System.out.println("뺄셈할 숫자 두개를 아주 빠르게 입력하세요.");
>>>>>>> b71ea6b5222dc2afd2a58f6f43a870e4b272922d
		x = scan.nextFloat();
		y = scan.nextFloat();
		Sub_cal sub = new Sub_cal(x,y);
		
		System.out.println(sub.Ans_print());
		
	}

}



