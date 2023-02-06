import java.io.Serializable;
import java.util.Date;

public class AlbumsBean implements Serializable {
    private String artist;
    private String name;
    private Date release_date;
    private float sales;
    private String genre;


    public AlbumsBean() {
    }
}