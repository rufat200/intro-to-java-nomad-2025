import processing.core.PApplet;

public class Part02 extends PApplet {
    int y = 0;
    int x;
    int deltaY = 1;
    float ang = 0.0f;
    int count = 5;
    float[] xs = new float[count];
    float[] ys = new float[count];
    float[] angs = new float[count];


    @Override
    public void settings(){

        size(900,900);
    }
    @Override
    public void setup() {
        for (int i = 0; i < count; i++) {
            xs[i] = 160 * i;
            ys[i] = random(height);
            angs[i] = random(TWO_PI);
        }
    }
    @Override
    public void draw() {
        background(0,0,0);
        for (int i = 0; i < count; i++){

            pushMatrix();
            translate(xs[i], ys[i]);
            rotate(angs[i]);
            stroke(255);
            strokeWeight(20);
            line(-75,0,75,0);
            line(0, -75, 0, 75);
            line(-45, -45, 45, 45);
            line(-45, 45, 45, -45);
            popMatrix();
            ys[i] += deltaY;
            angs[i]+=0.005f;
            System.out.println(ang);
            if (ys[i] > 900){
                ys[i] = 0;
            }
        }

    }
    public static void main(String[] args) {

        PApplet.main("Part02");
    }
}
