import java.util.*;
import java.text.DateFormat;
import java.text.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class DateFormat{
  public static void main(String[] args){
    Date date=Calender.getInstance().getTime();
    DateFormat dateformat = new SimpleDateFormat("yy-mm-dd hh:mm:ss");
    String strDate = dateFormat.format(date);
    System.out.println("Converted String: "+strDate);
  }
}
