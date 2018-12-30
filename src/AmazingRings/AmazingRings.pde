int x=200;
int y=400;
int x2=600;
int radius=20;
void setup(){
  size(800,800);
  background(#D3D3D3);
  
  
}
void draw(){
 
 for(int i=0; i<10; i++){
    noFill();
  background(#D3D3D3);
  ellipse(x,y,radius,radius);
  ellipse(x2, y,radius,radius);

   
  
 }

 if(radius>=300){
 }
 else{
   
 radius=radius+10;
 }
 x=x+1;
 x2=x2-1;
 
}