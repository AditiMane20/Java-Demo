public class UnaryOP3{
    public static void main(String[] args){
        int x=8;
        int y=5;

        int ans1= ++x + x++;
        int ans2= --y + y--;

        System.out.println(ans1); //9+9=18
        System.out.println(ans2); //4+4=8

        System.out.println(x); //10
        System.out.println(y); //3
        

    }
}