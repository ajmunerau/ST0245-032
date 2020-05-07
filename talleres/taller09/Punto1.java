
public class Punto1
{
   private int[] tabla;
   
   public Punto1(){
      tabla = new int[10];
   }

   private int funcionHash(String k){
       return ((int) k.charAt(0)) % 10;
   }

   public int get(String k){
     
       if(tabla[funcionHash(k)]!=0){
           System.out.println(k+" = "+tabla[funcionHash(k)]);
           return tabla[funcionHash(k)];
        }
      return 0;
   }
 
   public void put(String k, int v){  
    tabla[funcionHash(k)]=v;
   }

   public static void main(String[]args){
       Punto1 tabla = new Punto1();
       tabla.put("ana",300);
       tabla.put("brayan",200);
       tabla.put("carnie",400);
       tabla.get("ana");
       tabla.get("brayan");
       tabla.get("carnie");
   }
}
