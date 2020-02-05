package media;

/**
 * @author Coco
 * @date 2020/01/30
 */
public class DVD extends Item {
    private String director;


    public DVD(String title, String director, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.director = director;
    }

    @Override
    public void print() {
        System.out.print("DVD:");
        super.print();
        System.out.print("director:" + director + "]");
    }

}
