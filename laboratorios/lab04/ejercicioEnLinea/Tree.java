import java.util.TreeSet;
public class Tree
{
    public static Node root;
    public void buildingTree (int [] preOrder) {
        root=new Node(preOrder[0]);
        for (int i = 1; i < preOrder.length; i++) {
            insert(root, preOrder[i]);
        }
    }
    public static void insert(Node nodo, int n){            
        if(nodo.data==n){         
            return;
        }if(n<nodo.data){
            if(nodo.izq!=null){
                insert(nodo.izq, n);
            }else{
                nodo.izq=new Nodo(n);
            }
        }if(n>nodo.data){
            if(nodo.der!=null){
                insert(nodo.der,n);
            }else{
                nodo.rigth=new Node(n);
            }
        } 
    }
    public static void preOrder(Node nodo){
        if (nodo != null){
            System.out.println(nodo.data);
            preOrder(nodo.left);
            preOrder(nodo.rigth);
        }
    }
    public static void posOrder(Node nodo){
        if (nodo != null){
            posOrder(nodo.izq);
            posOrder(nodo.der);
            System.out.println(nodo.dato);
        }
    }
    public void exercise21 (int [] input) {
        buildingTree(input);
        System.out.println("PosOrder");
        posOrder(root);
        System.out.println();
    }
    public static void main (String [] args) {
        int [] test = {50,30,24,5,28,45,98,52,60};
        Tree testing = new Tree();
        testing.exercise21(test);
    }
}
