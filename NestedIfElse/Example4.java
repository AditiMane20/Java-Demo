//check temperature of person if temperature is greater tham 98.6 then (high), if in between 98.0 to 98.8 (normal),otherwise low
 class Example4{
    public static void main(String [] args){
        float temp=98.5f;

        if(temp>98.6){
            System.out.println("High Temperature");
        }else if (temp>98.0 && temp<=98.6){
            System.out.println("Normal Temperature");
        }else{
            System.out.println("Low Temperature");
        }

    }
 } 