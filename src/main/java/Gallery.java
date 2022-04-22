import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> artworks;

    // Constructor

    public Gallery(String name){
    this.name = name;
    this.till = till;
    this.artworks = new ArrayList<>();
    }

    // Method

    // Getters & setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }

    // Behaviours

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public int countArtwork(){
        return this.artworks.size();
    }



}
