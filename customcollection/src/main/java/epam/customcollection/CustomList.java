package epam.customcollection;
import java.util.Arrays;
public class CustomList<L>
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(L e) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = e;
    }
    @SuppressWarnings("unchecked")
    public L get(int i) {
       if (i >= size || i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (L) elements[i];
    }
    @SuppressWarnings("unchecked")
    public L remove(int i) {
       if (i >= size||i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (L) item;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() 
    {
         StringBuilder s = new StringBuilder();
         s.append('[');
         for(int j = 0; j < size ;j++) {
             s.append(elements[j].toString());
             if(j<size-1){
                 s.append(",");
             }
         }
         s.append(']');
         return s.toString();
    }
     
    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}


