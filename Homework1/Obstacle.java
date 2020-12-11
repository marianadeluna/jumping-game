

import processing.core.PApplet;


class Obstacle {
  float width = 50;
  float height = 40;
  
  float red;
  float green;
  float blue;
  
  float xPos;
  float yPos;
  
  
  Obstacle(float x, float y, float w, float h, float r, float g, float b) {
    xPos = x;
    yPos = y;
    width = w;
    height = h;
    red = r;
    green = g;
    blue = b;
  } // end constuctor
  
  void display(PApplet mainProcessing) {
    mainProcessing.fill(red, green, blue);
    mainProcessing.rect(xPos, yPos, 10, 40);
  } // end display

  void move() {
    xPos = xPos - 7;
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

  float getXPos() {
    return xPos;
  } //end getXPos
  
  float getYPos() {
    return yPos;
  } //end getYPos



} // end class