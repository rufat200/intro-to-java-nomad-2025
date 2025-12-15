import javax.swing.JOptionPane;
import processing.core.PApplet;

public class Part01 extends PApplet {

    int x;
    int y;

    int height = 900;
    int width = 900;

    int SQUARE = 50;
    int squares;


    @Override
    public void settings() {
        size(width, height);
    }
    @Override
    public void setup() {
        String v =  JOptionPane.showInputDialog(null, "Вводи размерность доски в клетках:");
        squares = Integer.parseInt(v) + 2;
        int gridSize = squares*SQUARE;
        x = (height-gridSize)/2;
        y = (width-gridSize)/2;
    }
    @Override
    public void draw() {
        int tempX = x;
        int tempY = y;
        int bo = -1;
        int r, g, b;
        background(0, 0, 0);
        for (int i = 0; i < squares; i++) {
            for (int j = 0; j < squares; j++) {
                if (j == 0 || j == squares-1 || i == 0 || i == squares-1){
                    r = 150;
                    g = 76;
                    b = 0;
                } else if (bo>0) {
                    r = 255;
                    g = 255;
                    b = 255;
                    bo *= -1;
                } else {
                    r = 0;
                    g = 0;
                    b = 0;
                    bo *= -1;
                }
                fill(r, g, b);
                square(tempX, tempY, SQUARE);
                tempX += SQUARE;
            }
            bo *= -1;
            tempX = x;
            tempY += SQUARE;
        }
        if (mouseX >= x && mouseY >= y && mouseX <= x + squares * SQUARE-SQUARE && mouseY <= y + squares * SQUARE-SQUARE) {
            int idX = (mouseX - x) / SQUARE;
            int idY = (mouseY - y) / SQUARE;
            fill(128, 128, 128);
            square(x + idX*SQUARE, y +idY*SQUARE, SQUARE);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Part01");
    }
}