import java.text.SimpleDateFormat;
import java.util.Date;

public class ChristmasEve {

//create a function that accepts date object
//the function returns true if dec 24th
//returns false otherwise

//    examples:
//    timeForMilkAndCookies(new Date(2013, 11, 24)) ➞ true
//    timeForMilkAndCookies(new Date(2013, 0, 23)) ➞ false
//    timeForMilkAndCookies(new Date(3000, 11, 24)) ➞ true

    public static void main (String[] args){

        Date christmasDate = new Date(2014,12,24);
        Date givenDate = new Date(2014,12,24);

        if(christmasDate.equals(givenDate)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

//        ********************************************
//        String correctDate = "2014-12-24";
//        String providedDate = "2013-11-24";
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(providedDate);
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(correctDate);
//
//        if(simpleDateFormat.equals(simpleDateFormat1)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        ********************************************

        //Creating an object of the SimpleDateFormat class
//        SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");
//       Date christmasDate = sdfo.parse(2014-12-24);
//        Date givenDate = sdfo.parse("2013-11-24");
//        timeForMilkAndCookies(givenDate));
//        if(givenDate.equals(christmasDate)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
    }

//    public boolean timeForMilkAndCookies(Date providedDate){
//
//        if(providedDate.equals(christmasDate)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
}
