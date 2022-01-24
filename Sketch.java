import processing.core.PApplet;

public class Sketch extends PApplet {
	float ySpeed = 2;
	float[] circleY = new float[25];
  int num = 50;
int[] x = new int[num];
int[] y = new int[num];
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
    for (int i = 0; i < circleY.length; i++) {
      circleY[i] = random(height);
      y = new int[width];
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(0);
	// sample code, delete this stuff
  
  for (int i = num-1; i > 0; i--) {
    x[i] = x[i-1];
    y[i] = y[i-1];
  }
  // Add the new values to the beginning of the array
  x[0] = mouseX;
  y[0] = mouseY;
  // Draw the circles
  for (int i = 0; i < num; i++) {
    fill(255,255,255, 500);
    ellipse(x[i], y[i], i/2, i/2);
  }
      for (int i = 0; i < circleY.length; i++) {
        float circleX = width * i / circleY.length;
        ellipse(circleX, circleY[i], 25, 25);
        
        circleY[i]++;
    
        if (circleY[i] > height) {
          circleY[i] = 0;
        }
        if (keyPressed) {
          if (keyCode == UP) {
            circleY[i]=circleY[i]+5;
          } 
          else if (keyCode == DOWN) {
            circleY[i]=circleY[i]+1/2;
          } 
            } 
            else{
              circleY[i]=circleY[i]+2;
            }
      
  }
  
  // define other methods down here.
}
}