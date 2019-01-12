float x=200;
float y=400;
float x2=600;
int radius=20;

void setup(){
  size(800,800);
  
}

 
  

  

void draw(){
      background(#D3D3D3);

   for(int i=20; i<500; i+=20){
    noFill();
    ellipse(x,y,i,i);
    noFill();
    ellipse(x2,y,i,i);  
   }
     x=x+0.5;
     x2=x2-0.5;
     
}