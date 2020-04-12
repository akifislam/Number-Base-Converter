public class NumberConverter {
    int number;

    NumberConverter(int n) {
    number = n;
    }

    int getNumber() {
        return number;
    }
    void setNumber(int n) {
    number = n ;
    }

    String toDecimal() {
        String Decimal = Integer.toString (number,10);
        System.out.println("The Decimal Value is : " +Decimal);
        return Decimal;
    }
    String toHex() {
    String Hexa = Integer.toHexString(number);
    Hexa = Hexa.toUpperCase();
    System.out.println("The Hexadecimal Representation is : " +Hexa );
    return Hexa;

    }
    String toBinary() {
        String Bin = Integer.toBinaryString(number);
        System.out.println("The Binary Representation is : " +Bin );
        return Bin;
    }

    String toOctal() {

        String Octa = Integer.toOctalString(number);
        System.out.println("The Octal Representation is : " +Octa );
        return Octa;
    }
}
