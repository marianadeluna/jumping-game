

import processing.core.PApplet;

class Door {
  
  float width = 30;
  float height = 65;
  
  float red;
  float green;
  float blue;
  
  float xPos;
  float yPos;   

  
  Door(float x, float y, float w, float h, float r, float g, float b) {
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
    mainProcessing.ellipse(xPos+25, yPos + 35, 7, 7);
  } // end display
  
  void move (float amount) {
    xPos = xPos - amount;
    if (xPos + 200 < 0) {
      xPos = 1000;
    } // end if
  } // end move
  
  
  
} // end class