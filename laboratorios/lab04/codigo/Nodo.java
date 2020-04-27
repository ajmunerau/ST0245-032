import java.util.ArrayList;
public class Nodo {
    private String name;
    private double size;
    private Nodo directory;
    private ArrayList<Nodo> files = new ArrayList<>();
    public Nodo(String name, double size, Nodo directory) {
        this.name = name;
        this.size = size;
        files.add(directory);
    }
    public Nodo(String name, Nodo directory) {
        this.name = name;
        files.add(directory);
    }
    public String getName() {
        return name;
    }
    public double getSize() {
        return size;
    }
    public Nodo getDirectory() {
        return directory;
    }
    public void addFile(Nodo node) {
        files.add(node);
    }
    public Nodo getFile(int i) {
        return files.get(i);
    }
    public int getFilesSize() {
        return files.size();
    }
