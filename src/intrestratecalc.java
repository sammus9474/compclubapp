public class intrestratecalc {

    public static void main(String[] args) {


        int totalCasesSold = 29;
        int barspercase = 100;
        double priceperbar = 1.50;
        double totalprofit;
        int totalbarssold;
        double ammToSA;

        totalbarssold = totalCasesSold * barspercase;
        totalprofit = totalbarssold * priceperbar - totalCasesSold * barspercase;
        ammToSA = totalprofit * .10;

        System.out.println(totalbarssold);
        System.out.print(" ");
        System.out.print(totalprofit);
        System.out.print(" ");
        System.out.print(ammToSA);



    }
}
