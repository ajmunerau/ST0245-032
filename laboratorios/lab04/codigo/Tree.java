public class Tree {
    private static Node2 root = new Node2("Proyecto", null);
    public static void insertion(String name, double size) {
        Node2 n = new Node2(name, size, root);
        root.addFile(n);
    }
    public static void insertion(String directory, String name, double size) {
        Node2 node = insertionAux(root, directory);
        Node2 n = new Node2(name, size, node);
        node.addFile(n);
    }
    public static Node2 insertionAux(Node2 node, String name) {
        if(node.getName().equals(name)) return node;
        for(int i = 0; i < node.getFilesSize(); i++)
            insertionAux(node.getFile(i), name);
        return null;
    }
    public static void search(String s) {
        String [] array = s.split("/");
        searchAux(array, root, 0);
    }
    public static void search(String s, double size) {
        String [] array = s.split("/");
        searchAux(array, root, 0);
    }
    public static void searchAux(String [] array, Node2 node, int p) {
        if(node.getName().equals(array[p])) {
            for(int i = 0; i < node.getFilesSize();i++) {
                System.out.println(node.getFile(i).getName());
            }
        }
        if(p <= array.length) {
            for (int i = 0; i < node.getFilesSize(); i++) {
                searchAux(array, node, p++);
                searchAux(array, node.getFile(i), 0);
            }
        }
    }
    public static void searchAux(String [] array, Node2 node, int p, double size) {
        if(node.getName().equals(array[p])) {
            for(int i = 0; i < node.getFilesSize();i++) {
                if (node.getFile(i).getSize() < size) System.out.println(node.getFile(i).getName());
            }
        } else System.out.println("No existe");
        if(p<=array.length) {
            for (int i = 0; i < node.getFilesSize(); i++) {
                searchAux(array, node, p++);
                searchAux(array, node.getFile(i), 0);
            }
        }
    }
