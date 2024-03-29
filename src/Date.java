import javax.swing.*;
import java.text.*;
import java.util.*;
/** sets up an arbitrary date using a GregorianCalendar object
 * and displays it using a SimpleDateFormat
 */
public class Date {
    public static void main( String args[] ) {
        GregorianCalendar today,birthday;
        // capture today's date
        today = new GregorianCalendar();
        // set up the date of your birthday: nb year, month, day: and month counts from 0
        birthday = new GregorianCalendar(1996,06,18);
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE MMMM dd'th', yyyy");
        JOptionPane.showMessageDialog(
                null, "Today is " + f3.format(today.getTime()) );
        JOptionPane.showMessageDialog(
                null, "My birthday is " + f3.format(birthday.getTime()) );
        JOptionPane.showMessageDialog(null,"I was born in month " + (birthday.get(Calendar.MONTH)+1));
        JOptionPane.showMessageDialog(null,"in the year " + (birthday.get(Calendar.YEAR)));
        JOptionPane.showMessageDialog(null,"on day " + (birthday.get(Calendar.DATE)));
        System.exit( 0 );  // terminate the program
    }
}
