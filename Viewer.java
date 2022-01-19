import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Viewer {
    private Image down;
    private Image ghost;
    private Image heart;
    private Image left;
    private Image pacman;
    private Image right;
    private Image up;
    private ImegeView downView;
    private ImegeView ghostView;
    private ImegeView heartView;
    private ImegeView leftView;
    private ImegeView pacmanView;
    private ImegeView rightView;
    private ImegeView upView;

    down = new Image("file:images/down.gif");
    downView.setImage(down);
    ghost = new Image("file:images/ghost.gif");
    ghostView.setImage(ghost);
    heart = new Image("file:images/heart.gif");
    heartView.setImage(heart);
    left = new Image("file:images/left.gif");
    leftView.setImage(left);
    pacman = new Image("file:images/pacman.gif");
    pacmanView.setImage(pacman);
    right = new Image("file:images/right.gif");
    rightView.setImage(right);
    up = new Image("file:images/up.gif");
    upView.setImage(up);

    downView.setWidth(5);
    downView.setHeight(5);
    ghostView.setWidth(5);
    ghostView.setHeight(5);
    heartView.setWidth(5);
    heartView.setHeight(5);
    leftView.setWidth(5);
    leftView.setHeight(5);
    pacmanView.setWidth(5);
    pacmanView.setHeight(5);
    rightView.setWidth(5);
    rightView.setHeight(5);
    upView.setWidth(5);
    upView.setHeight(5);
}
