//Bitwise Operator(&,|,^,<<,>>,>>>,,~)
public class BitwiseOP{
    public static void main(String[] args){
        int x=5;
        int y=7;

        System.out.println(x&y); //5=0101 &7=0111 using and operator we get 0101=5
        System.out.println(x|y); //5=0101 &7=0111 using and operator we get 0111=7

        System.out.println(x<<2);
        System.out.println(y>>2);

        System.out.println(~x); //For this take number them it's 1's complement & then 2's complement
        System.out.println(y>>>3);
        
    }
}