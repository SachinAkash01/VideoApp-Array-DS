package Code;

/**
 *
 * @author it21351372
 */
public class Video {
    private String name;
    private String genre;
    public boolean borrowed;

    public Video(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.borrowed = false;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
    
    
}
