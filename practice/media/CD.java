package media;

/**
 * @author Coco
 * @date 2020/01/30
 */
public class CD extends Item {
    private String artist;
    private int numOfTracks;


    public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numOfTracks = numOfTracks;
    }


    @Override
    public void print() {
        System.out.print("CD:");
        super.print();
        System.out.print("artist:" + artist + "]");
    }
}
