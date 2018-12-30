int x=400;
int y=400;
int radius=20;
void setup(){
  size(800,800);
  
  
  
}
void draw(){
 for(int i=0; i<10; i++){
    noFill();
  ellipse(x,y,radius,radius);
  
   
   
  
 }
 if(radius>=500){
 }
 else{
 radius=radius+10;
 }
 
}