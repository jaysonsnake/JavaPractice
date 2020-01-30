package practice.media;

/**
 * @author Coco
 * @date 2020/01/30
 */

public class CD {

    private String title;
    private String artist;
    private int numOfTracks;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;


    public CD(String title, String artist, int numOfTracks, int playingTime, boolean gotIt, String comment) {
        this.title = title;
        this.artist = artist;
        this.numOfTracks = numOfTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }
}
