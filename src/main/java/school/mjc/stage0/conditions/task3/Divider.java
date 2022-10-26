package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {

        int five=5;
        int eleven=11;
        if (five!=0||eleven!=0){
            if (number%5==0||number%7==0){
                System.out.println("Dividable");
            }else {
                System.out.println("cannot divide by zero");
            }
        }else {
            System.out.println("Non-dividable");
        }
    }
}
