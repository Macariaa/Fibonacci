import java.math.BigDecimal;

public class Fibonacci {
	
	public static int of(int n) {
		if(n==1||n==0) {
			return 1;
		}else if(n>1){
			return of(n-1)+of(n-2);
		}else {
			return 0;
		}
		
	}
    public static void main(String[] args) {
        for (int i=1;i<=200;i++) {
            System.out.println("Fibonacci.of("+i+")="+Fibonacci.of(i));
        }


    }

}