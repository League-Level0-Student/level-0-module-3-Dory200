
void setup() {
 size(800, 800);
  // set the size of your sketch
  

int x = 400;
int y = 300;
int w = 200;
int h = 250;

  for(int i = 0; i <= 8; i++) {
    if(i%2==0){
  fill(#FF0000);
}
else{
  fill(#006CFF);
}
    ellipse(x, y, w, h);
    x += 0;
    y += 5;
    w -= 20;
    h -= 20;
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  

}
