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

    Date christmasDate = new Date(2014,12,24);

    public static void main (String[] args){


        Date givenDate = new Date(2014,12,24);


        ChristmasEve ce = new ChristmasEve();
        System.out.println((ce.timeForMilkAndCookies(givenDate)));






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

    private boolean timeForMilkAndCookies(Date providedDate) {
        if(christmasDate.equals(providedDate)){
//            System.out.println("true");
            return true;
        }
        else{
//            System.out.println("false");
            return false;
        }
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
