package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata6 {

       public static void main(String[] args) throws FileNotFoundException, IOException {
            String name = "C:\\Users\\usuario\\Downloads\\emails.txt";
            ArrayList<String> listMail = MailList.read(name);
            Histogram<String> histogram = MailHistogramBuilder.build(listMail);
            HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
            histogramDisplay.execute();
        }
}
