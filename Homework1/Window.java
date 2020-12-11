
import processing.core.PApplet;

class Window {
  
  float width = 10;
  float height = 10;
  
  float red;
  float green;
  float blue;
  
  float xPos;
  float yPos;  
  
  Window(float x, float y, float w, float h, float r, float g, float b) {
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
    mainProcessing.rect(xPos, yPos, width, height);
    mainProcessing.line(xPos, yPos+height/2, xPos+width, yPos+height/2);
    mainProcessing.line(xPos+width/2, yPos, xPos+width/2, yPos+height);
  } // end display
  
  void move (float amount) {
    xPos = xPos - amount;
    if (xPos + 200 < 0) {
      xPos = 1000;
    } // end if    
  } // end move
  
} // end class