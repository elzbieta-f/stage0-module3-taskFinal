package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first=number%10;
        int second=(number%100)/10;
        int third=number/100;

        int result=first*100+second*10+third;

        System.out.println(result);
    }
}
