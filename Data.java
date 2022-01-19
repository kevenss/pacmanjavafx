import Position;

public class Data {
    private int numberChances;
    private Position position;

    numberChances = 3;
    
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position p) {
        this.position = position;
    }

    public void catchPacmam() {
        numberChances--;
    }

}