package castle;

/**
 * @author Coco
 * @date 2020/02/06
 */
public class Handler {
    protected Game game;
    protected Handler(Game game) {
        this.game = game;
    }

    public void doCmd(String word) {}
    public boolean isBye() {
        return false;
    }
}
