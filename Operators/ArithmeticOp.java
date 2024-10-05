//Arithmetic Operators(+,-,*,/,%)
class ArithmeticOp{
	public static void main(String[] args){
	  int x=4;
	  int y=5;
	  int z=6;

    System.out.println(x+y+z);
    System.out.println(y-x);
    System.out.println(x*y*z);
	System.out.println(x/y);
	System.out.println(x%y);
             
	int ans=x+y*z+(x-y);
	System.out.println(ans);
	}
}

