
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {

        Album album1 = new Album();
        Album album2 = new Album();
        Album album3 = new Album();
        Author james = new Author();
        Author mark = new Author();
        Author luke = new Author();
        ArrayList<Quote> quotes = new ArrayList<>();
        Quote doit = new Quote();
        Quote etu = new Quote();

        doit.setContent("Just DO IT!");
        doit.setAuthor("Shia Lebouf");
        doit.setAuthor_id(1);

        etu.setContent("You too Brutus?");
        etu.setAuthor("Ceaser");
        etu.setAuthor_id(2);

        quotes.add(doit);
        quotes.add(etu);
//        album1.setName("Hells Bells");
//        album1.setGenre("Rock");
//        album1.setArtist("AC/DC");
//        album1.setSales(25);
//        album1.setRelease_date(DateFormat.parse("2000-12-12"));
        for (int i =0; i < quotes.size(); i++){
            System.out.println(quotes.get(i).getAuthor_id());
            System.out.println(quotes.get(i).getAuthor());
            System.out.println(quotes.get(i).getContent());
        }

    }
}
