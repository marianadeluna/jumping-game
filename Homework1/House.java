

import processing.core.PApplet;


class House {
  float width = 800;
  float height = 200;
  
  float red;
  float green;
  float blue;
  
  float xPos;
  float yPos;
  
  float xDir = 1;
  float key;
  float CODED;
  float keyCode;
  float LEFT;
  float RIGHT;
  
  Window window;
  Window window2;
  Window window3;
  Door door;
  Roof roof;
  
  House(float x, float y, float w, float h, float r, float g, float b, float d) {
    xPos = x;
    yPos = y;
    xDir = d;
    width = w;
    height = h;
    red = r;
    green = g;
    blue = b;
    window = new Window(xPos + 20, yPos + 50, width/9, height/5, 0, 255, 255);
    window2 = new Window(xPos + .45f * width, yPos + 50, width/9, height/5, 0, 255, 255);
    window3 = new Window(xPos + .8f * width, yPos + 50, width/9, height/5, 0, 255, 255);
    door = new Door(xPos + 100, yPos + 135, 30, 65, 0, 0, 255);
    roof = new Roof(xPos, yPos, 200, 100, 0,0,255);
  } // end constuctor
  
  void display(PApplet mainProcessing) {
    mainProcessing.fill(red, green, blue);
    mainProcessing.rect(xPos, yPos, width, height);
    window.display(mainProcessing);
    window2.display(mainProcessing);
    window3.display(mainProcessing);
    door.display(mainProcessing);
    roof.display(mainProcessing);
  } // end display
  
  void move (float amount) {
    xPos = xPos - amount;
    if (xPos + width > 0) {
    window.move(amount);
    window2.move(amount);
    window3.move(amount);
    door.move(amount);
    roof.move(amount);
    } // end if
  } // end move
  

  
  
  void setXPos(float newValue) {
    xPos = newValue;
  } //end setXPos
  
  void setYPos(float newValue) {
    yPos = newValue;
  } //end setYPos
  
  void setWidth(float newValue) {
    width = newValue;
  } //end setWidth  
  
  void setHeight(float newValue) {
    height = newValue;
  } //end setHeight  
  
  void setRed(float newValue) {
    red = newValue;
  } //end setRed
  
  void setGreen(float newValue) {
    green = newValue;
  } //end setGreen
  
  void setBlue(float newValue) {
    blue = newValue;
  } //end setBlue
    
  void keyPressed() {
    if (key == CODED) {
      if (keyCode == RIGHT) {
        xDir = -1;
      } else if (keyCode == LEFT) {
        xDir = 1;
      } // end if
    } // end if
  } // end keyPressed


} // end class