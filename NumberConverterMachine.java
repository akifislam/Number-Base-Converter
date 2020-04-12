import java.util.Scanner;

public class NumberConverterMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int press,n;
        System.out.println("Enter a number to convert");
        n = input.nextInt();


        NumberConverter AkifMachine = new NumberConverter(n);

        System.out.println("You have inputed : " +AkifMachine.getNumber() );
        System.out.println();

        System.out.printf("In Which Conversion do you want?\nPress 1 for Binary\nPress 2 for HexaDecimal\nPress 3 for Octal\nPress 4 for Decimal\nPress 5 for All Conversions\n");
        press = input.nextInt();
        System.out.println();
        if(press==1)AkifMachine.toBinary();
        if(press==2)AkifMachine.toHex();
        if(press==3)AkifMachine.toOctal();
        if(press==4) AkifMachine.toDecimal();
        if(press==5) {
            AkifMachine.toBinary();
            AkifMachine.toHex();
            AkifMachine.toOctal();
            AkifMachine.toDecimal();
        }
        System.out.println();
        System.out.println();
        System.out.println("Thank you Sir ! I really enjoyed this assignment");
    }
}
