
import processing.core.PApplet;

class Roof {
  
  float width = 50;
  float height = 50;
  
  float red;
  float green;
  float blue;
  
  float xPos;
  float yPos;  

  
  Roof(float x, float y, float w, float h, float r, float g, float b) {
    xPos = x;
    yPos = y;
    width = w;
    height = h;
    red = r;
    green = g;
    blue = b;  
  } // end constructor
  
  void display(PApplet mainProcessing) {
    mainProcessing.fill(red, green, blue);
    mainProcessing.triangle(xPos, yPos, xPos + width, yPos, xPos+width/2, yPos - height);
  } // end display
  
  void move (float amount) {
    xPos = xPos - amount;
    if (xPos + 196 < 0) {
      xPos = 1000;
    } // end if
  } // end move
  
  
} // end class