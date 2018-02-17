import java.util.Scanner;

public class lab4main {
    public static void main(String[] args){

        int stringNumber, stringLength, hexLocation, asciiNumber;
        int hexDecimal = 0;
        double hexTotal = 0;
        String userInput;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a hexadecimal number: ");
        userInput = scnr.nextLine();
        stringLength = userInput.length() - 1;
        stringNumber = stringLength;

        if (userInput.charAt(0) == '0' && userInput.charAt(1) == 'x') {
            while ( stringNumber >= 2 ){
                asciiNumber = (int) userInput.charAt(stringNumber);
                hexLocation = stringLength - stringNumber;

                if ((asciiNumber >= 48) && (asciiNumber <= 57)){
                    hexDecimal = asciiNumber - 48;
                }
                if ((asciiNumber >= 65) && (asciiNumber <= 90)){
                    hexDecimal = asciiNumber - 55;
                }
                if ((asciiNumber >= 97) && (asciiNumber <= 122)){
                    hexDecimal = asciiNumber - 87;
                }
                hexTotal += (hexDecimal * Math.pow(16,hexLocation));
                stringNumber--;
            }
        }
        else {
            while ( stringNumber >= 0 ){
                asciiNumber = (int) userInput.charAt(stringNumber);
                hexLocation = stringLength - stringNumber;

                if ((asciiNumber >= 48) && (asciiNumber <= 57)){
                    hexDecimal = asciiNumber - 48;
                }
                if ((asciiNumber >= 65) && (asciiNumber <= 90)){
                    hexDecimal = asciiNumber - 55;
                }
                if ((asciiNumber >= 97) && (asciiNumber <= 122)){
                    hexDecimal = asciiNumber - 87;
                }
                hexTotal += (hexDecimal * Math.pow(16,hexLocation));
                stringNumber--;
            }
        }
        if (hexTotal <= 2147483647){
            System.out.println("Your number is " + (int) hexTotal + " in decimal");
        }
        else {
            System.out.println("Your number is " + (long)hexTotal + " in decimal");
        }
    }
}
