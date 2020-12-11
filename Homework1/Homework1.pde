

public class Homework1 extends PApplet {
  
  ArrayList<Obstacle> obstacleList = new ArrayList<Obstacle>();
  ArrayList<House> houseList = new ArrayList<House>();
  ArrayList<Prize> prizeList = new ArrayList<Prize>();

  House theHouse;
  Creature theCreature;
  Obstacle theObstacle;
  Prize thePrize;
  
  float xDir = 1;
  float score;
  
  void settings() {
    size(1000,800);
  } // end settings
  
  void setup() {
    int count;
    count = 2;
    while (count < 100) {
      houseList.add( new House(count * 300, 200, 200, 200, 255, 0, 0, 1));
      count ++;
    } // end while    
    
    int count2;
    count2 = 2;
    while (count2 < 100) {
      obstacleList.add( new Obstacle(count2 * 400, height/2 + 100, 50, 40, 120, 0, 120));
      count2 ++;
    } // end while
    
    theCreature = new Creature(width/2, height/2 + 100, 50, 50, 98, 101, 93);
    
    int count3;
    count3 = 3;
    while (count3 < 25) {
      prizeList.add( new Prize(count3 * 300, 525, 50, 50, 255, 255, 51));
      count3 ++;
    } // end while 
    
  } // end setup
  
  void draw() {
    background(153,204,255);
       textSize(24);
       text(score, 100,100);
       
   for (House house: houseList) {
    house.display(this);
    house.move(xDir);
    house.keyPressed();
 } // end for
 
   for (Obstacle obstacle: obstacleList) {
    obstacle.display(this);
    obstacle.move();
    if (collide(obstacle, theCreature)) {
      score = score - 1;
    } // end if
  } // end for

   
   for (Prize prize: prizeList) {
    prize.display(this);
    prize.move();
    if (collide(prize, theCreature)) {
      score = score + 2;
    } // end if
  } // end for
   
   theCreature.display(this);
  
  
 } // end draw
  
  void mousePressed() {
    theCreature.up();
  } // end mousePressed
  
  void mouseReleased() {
    theCreature.fall();
  } // end mouseReleased


  boolean collide(Obstacle obstacle, Creature theCreature) {
    if (dist(obstacle.getXPos(), obstacle.getYPos(),theCreature.getXPos(), theCreature.getYPos()) <= 0) {
      return true;
    } else {
    } return false;
} // end collide

  boolean collide(Prize prize, Creature theCreature) {
    if (dist(prize.getXPos(), prize.getYPos(),theCreature.getXPos(), theCreature.getYPos()) <= 0) {
      return true;
    } else {
    } return false;
} // end collide
 
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
  
  

    