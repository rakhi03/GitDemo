
class Calculation {
	   int z;
		
	   public int addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	      return z;
	   }
		
	   public int Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	      return z;
	   }
	}
	public class My_Calculation extends Calculation {
	   public void division(int x, int y) {
	      z = x/y;
	      System.out.println("The product of the given numbers:"+z);
	   }
		
	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      My_Calculation demo = new My_Calculation();
	      int m = demo.addition(a, b);
	     int n= demo.Subtraction(a, b);
	      demo.division(m, n);
	      
	    
	   }
	}