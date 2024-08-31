import java.io.*;

public class HendlingExceptionsSignature {
    public static void main(String[] args)  {
        String str = "12345a";
        try {
            int number = parseStringToInt(str);
            System.out.println("Number = " + number);
        } catch (NumberFormatException e) {
            System.out.println("String cannot be converted to number");
            try {
                throw new IOException ("String to number conversion exception", e);

            }
            catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    public static int parseStringToInt(String str) throws NumberFormatException {
        return convertStringToInt(str);

    }

    public static int convertStringToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}

