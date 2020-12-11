
import processing.core.PApplet;

class Creature {
  
  float width = 10;
  float height = 10;
  
  float red;
  float green;
  float blue;
  
  float xPos;
  float yPos;  
 
  boolean jumping;
 
  float score = 0;


  
  Creature(float x, float y, float w, float h, float r, float g, float b) {
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
    mainProcessing.ellipse(xPos, yPos, width, height);
    mainProcessing.ellipse(xPos + 10, yPos -2, width/5, height/5);
    mainProcessing.ellipse(xPos - 10, yPos -2, width/5, height/5);
    mainProcessing.fill(0,0,0);
    mainProcessing.ellipse(xPos + 10, yPos -2, width/13, height/13);
    mainProcessing.ellipse(xPos - 10, yPos -2, width/13, height/13);    
    mainProcessing.fill(16,114,114);
    mainProcessing.triangle(xPos, yPos + 3, xPos - 5, yPos + 8, xPos + 5, yPos + 8);
    mainProcessing.fill(238,250,67);
    mainProcessing.triangle(xPos - 10, yPos + 13,xPos, yPos + 18, xPos + 10, yPos + 13);
    
  } // end display
  
 
 void up() {
   yPos = 450;
 } // end up
 
 void fall() {
   yPos = 500;
 } // end fall
 
  void setXPos(float newValue) {
    xPos = newValue;
  } //end setXPos
  
  void setYPos(float newValue) {
    yPos = newValue;
  } //end setYPos
 
  float getXPos() {
    return xPos;
  } //end getXPos
  
  float getYPos() {
    return yPos;
  } //end getYPos



  
} // end class