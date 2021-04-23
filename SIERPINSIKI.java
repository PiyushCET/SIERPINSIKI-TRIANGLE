package triangle; 
import java.lang.Math; 
import java.awt.Color; 
import java.awt.*; 
import javax.swing.JFrame; 
public class Triangle extends Canvas{ 
    double p(double m){ 
return m*m; 
} 
    double abs(double n){ 
    if(n<0) 
        return -n; 
    else  
        return n; 
    } 
public void paint(Graphics g) { 
Color A=new Color(100,100,255); 
Color B=new Color(255,0,0); 
Color C=new Color(255,255,0); 
Color D=new Color(0,0,0); 
int c=0; 
for(int i=300;i<1200;i++){ 
for(int j=0;j<1000;j++){ 
  if(j<=672&&j>=1.75*(i-768)&&j>=(-1.75)*(i-768)){ 
if((7*(i%24)+4*(j%42)-168<=0&&7*(i%24)-4*(j%42)>=0)||((j%42)>21&&(i%24)<=24&&(7*(i%24)+4*(j%42)-168<=0||7*(i%24)-4*(j%42)>=0)&&(j%42)<=42)){ 
      
       g.setColor(B);       
g.drawLine(i, j, i, j);  
    } 
else{ 
g.setColor(C);       
g.drawLine(i, j, i, j); 
} 
  } 
      
    else{ 
       
    g.setColor(D);       
g.drawLine(i, j, i, j);  
    } 
} 
} 
for(int i=300;i<1200;i++){ 
for(int j=0;j<1000;j++){ 
 if(j<=672&&j>=1.75*(i-768)&&j>=(-1.75)*(i-768)){     
if((j%84)<=84&&(i%48)<=48&&(((j%84)<=21&&(j%84)>=1.75*((i%48)-24)&&(j%84)>=-1.75*((i%48)-24)) 
        ||((i%48)<=48&&(j%84)<=63&&((j%84)-63)>=-1.75*((i%48)-36))||((j%84)<=63&&(j%84)-42>=1.75*(i%48)) 
        )){ 
      
       g.setColor(B);       
g.drawLine(i, j, i, j);  
    } 
 
  } 
} 
} 
 
 
for(int i=300;i<1200;i++){ 
for(int j=0;j<1000;j++){ 
 if(j<=672&&j>=1.75*(i-768)&&j>=(-1.75)*(i-768)){     
if(j%168<=42&&j%168>=1.75*((i%96)-48)&&j%168>=-1.75*((i%96)-48) 
        ||j%168<=126&&((j%168)-84)>=1.75*(i%96) 
        ||(j%168)<=126&&(i%96)<=96&&((j%168)-84)>=-1.75*((i%96)-96)){ 
      
       g.setColor(B);       
g.drawLine(i, j, i, j);  
    } 
 
  } 
} 
} 
for(int i=300;i<1200;i++){ 
for(int j=0;j<1000;j++){ 
 if(j<=672&&j>=1.75*(i-768)&&j>=(-1.75)*(i-768)){    
if(j%336<=84&&j%336>=1.75*((i%192)-96)&&j%336>=-1.75*((i%192)-96) 
        ||j%336<=252&&((j%336)-168)>=1.75*(i%192) 
        ||(j%336)<=252&&(i%192)<=192&&((j%336)-168)>=-1.75*((i%192)-192)){ 
     
       g.setColor(B);       
g.drawLine(i, j, i, j);  
    } 
 
  } 
} 
} 
for(int i=300;i<1200;i++){ 
for(int j=0;j<1000;j++){ 
    if(j<=672&&j>=1.75*(i-768)&&j>=(-1.75)*(i-768)){ 
if(j%672<=168&&j%672>=1.75*((i%384)-192)&&j%672>=-1.75*((i%384)-192) 
        ||j%672<=504&&((j%672)-336)>=1.75*(i%384) 
        ||(j%672)<=504&&(i%384)<=384&&((j%672)-336)>=-1.75*((i%384)-384)){ 
      
       g.setColor(B);       
g.drawLine(i, j, i, j);  
    } 
 
  } 
} 
} 
 g.setColor(B); 
 g.drawLine(768, 0, 384, 672); 
g.drawLine(768, 0, 1152, 672); 
 
 
} 
public static void main(String[] args) { 
 Triangle m=new Triangle(); 
JFrame f=new JFrame(); 
f.add(m); 
f.setSize(5000,5000); 
f.setVisible(true); 
} 
} 
