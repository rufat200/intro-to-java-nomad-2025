import processing.core.PApplet;

public class Main extends PApplet {
    int x;
    int y;

    @Override
    public void settings(){
        size(800, 600);
    }

    @Override
    public void setup(){
        x = width/2;
        y = height/2;
    }

    @Override
    public void draw(){
        super.draw();
        line(x, y, x+ 200, y);

    }
    public static void main(String[] args) {
        PApplet.main("Main");
    }
}