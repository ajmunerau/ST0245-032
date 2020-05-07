import java.util.ArrayList;

public class Path
{
    public boolean sc(final ArrayList<Integer> a, final int b) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == b) {
                return true;
            }
        }return false;
    }
     public boolean depth(final DigraphAL a, final int b, final int c) {
        final ArrayList<Integer> d = a.getSuccessors(b);
        if (d.size() == 0) {
            return false;
        } else if (sc(d, c)) {
            return true;
        } else {
            for (int i = 0; i < d.size(); i++) {
                depth(a, d.get(i), c);
            }
        }return false;
    }
    public boolean aux(final DigraphAL a, final ArrayList<Integer> b) {
        ArrayList<Integer> d = new ArrayList();
        boolean c = false;
        for (int i = 0; i < b.size(); i++) {
            d = a.getSuccessors(b.get(i));
            for (int j = 0; j < b.size(); j++) {
                if (d.contains(b.get(j))) {
                    c = true;
                }
            }
        }return c;
    }
    public boolean amplitud(final DigraphAL a, final int b, final int c) {
        final ArrayList<Integer> d = a.getSuccessors(b);
        if(d.size()==0){
            return false; 
        }else if(aux(a,d)) {
            return aux(a,d);
        }else{
            for(int i = 0; i<d.size();i++){
                amplitud(a,d.get(i),c);
            }
        }return false;
    }
}
