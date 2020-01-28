public class Punto{
  private int x, y; // dos atributos privados y están encapsulados

  public Punto(int coordenadaX, int coordenadaY){ // 1er constructor: para construir un punto utilizando coordenadas
  this.x =  coordenadaX;
  this.y =  coordenadaY;
 }
  public Punto(){ //Inicializar los atributos en cero
  this.x = 0;
  this.y = 0;  
 }
  public int getX(){
  return x;
 }
  public int getY(){
  return y;
 }
  public double getRadioPolar(){
  return Math.sqrt((x*x) + (y*y));
 }
  public double getAnguloPolar(){
  return Math.atan(y/x);
 }
  public double getDistanciaEuclediana(){ 
  return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // Fragmento de código tomado de: https://tpec05.blogspot.com/2017/07/como-programar-formula-de-la-distancia.html
 }
  void setX (int valorX){
  this.x = valorX;
 }
 void setY (int valorY){
  this.y = valorY;
 }
}