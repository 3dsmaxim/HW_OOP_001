import java.util.Iterator;
import java.util.LinkedList;

public class HotDrinkIterator  implements Iterator<HotDrink> {
    public int count;
    public LinkedList<HotDrink> li ;

    public HotDrinkIterator() {
        this.count = 0;
        li = new LinkedList<>();
    }

    @Override
    public boolean hasNext() {

        return count < li.size();
    }

    @Override
    public HotDrink next() {
        if (!hasNext()) {
            throw new RuntimeException("Students");
        }

        return li.get(count++);
    }

}
