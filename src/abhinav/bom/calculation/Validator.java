package abhinav.bom.calculation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean validate(String input)
    {
        //checking for null values
        if(input==null || input.trim().isEmpty())
            return false;


        //checking if the string has alphabets and special characters or not
        boolean checkForLettersAndDigits= checkForIntegerValue(input);
        if(!checkForLettersAndDigits)
            return false;


        //checking if the input is double or not
        double doubleInput=Double.parseDouble(input);
        if(Math.floor(doubleInput)!=Math.ceil(doubleInput))
            return false;


        //checking if the input is -ve and for overflow
        int intInput=Integer.parseInt(input);
        return intInput > 0 && intInput < Integer.MAX_VALUE;
    }

    public static boolean checkForIntegerValue(String input)
    {
        Pattern onlyDigits = Pattern.compile("[^0-9]");//checking if it contains characters other than digit
        Matcher digitMatcher = onlyDigits.matcher(input);

        boolean check = digitMatcher.find();
        if(check)  //if other characters are found
            return false; //string is invalid
        return true;

    }
}
