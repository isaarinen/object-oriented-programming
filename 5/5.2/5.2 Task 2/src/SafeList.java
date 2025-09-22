import java.util.ArrayList;
import java.util.List;

public class SafeList<T> {
    private final List<T> list = new ArrayList<>();

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized T remove(int index) {
        if (index >= 0 && index < list.size()) {
            return list.remove(index);
        }
        return null;
    }
}
