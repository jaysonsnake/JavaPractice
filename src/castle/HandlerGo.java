package castle;

/**
 * @author Coco
 * @date 2020/02/06
 */
public class HandlerGo extends Handler {
    public HandlerGo(Game game) {
        super(game);
    }

    @Override
    public void doCmd(String direction) {
        game.goRoom(direction);
    }

}
