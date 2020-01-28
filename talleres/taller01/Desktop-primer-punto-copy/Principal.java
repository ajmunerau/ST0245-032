public class Principal {
   public static void main (String [] args){
    Punto objeto = new Punto();
    objeto.setX(10);
    objeto.setY(20);
    System.out.println("X: " + objeto.getX());
    System.out.println("Y: " + objeto.getY());
    System.out.println("Radio polar: " + objeto.getRadioPolar()); 
    System.out.println("Ángulo polar: " + objeto.getAnguloPolar() + " radianes");
    System.out.println("Distancia Euclediana: " + objeto.getDistanciaEuclediana());
  }
}