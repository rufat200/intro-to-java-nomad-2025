import processing.core.PApplet;

public class Problem01 extends PApplet {
    int x;
    int y;
    int customWidth;
    int customHeight;

    @Override
    public void settings() {
        customHeight = 960;
        customWidth = 960;
        size(customWidth, customHeight);
    }

    @Override
    public void setup() {
        x = customHeight / 3;
        y = customWidth / 3;

    }

    @Override
    public void draw() {
        int tempX = x;
        int tempY = y;
        int boolNum = 1;
        int r, g, b;
        background(0,0,0);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || j == 9 || i == 0 || i == 9){
                    r=150;
                    g=76;
                    b=0;
                } else if (boolNum > 0){
                    r=255;
                    g=255;
                    b=255;
                    boolNum *= -1;
                } else {
                    r=0;
                    g=0;
                    b=0;
                    boolNum *= -1;
                }
                fill(r, g, b);
                square(tempX, tempY, 32);
                tempX += 32;
            }
            boolNum *= -1;
            tempX = x;
            tempY += 32;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}
