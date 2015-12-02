package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata6 {

       public static void main(String[] args) throws FileNotFoundException, IOException {
            System.out.println("Inicio");
            String name = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata6\\emails.txt";
            ArrayList<Person> listMail = MailList.read(name);
            System.out.println(listMail.size());
            HistogramBuilder <Person> builder = new HistogramBuilder<> (listMail);
            
            Histogram<String> domains = builder.build(new Attribute<Person, String>() {

                @Override
                public String get(Person item) {
                    return item.getMail().split("@")[1];
                }
            });
            
            Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

                @Override
                public Character get(Person item) {
                    return item.getMail().charAt(0);
                }
            });
            
            new HistogramDisplay(domains, "DOMINIIOS").execute();
            new HistogramDisplay(letters, "CARACTER").execute();
            System.out.println("Fin");
        }
}
