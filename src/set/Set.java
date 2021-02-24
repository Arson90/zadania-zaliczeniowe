package set;

import java.util.ArrayList;
import java.util.List;

public class Set {

    private List<String> set;

    public Set() {
        this.set = new ArrayList<>();
    }

    public void add(String element) {
        if (!hasElement(element)) {
            set.add(element);
        }
    }

    public void remove(String element) {
        if (hasElement(element)) {
            set.remove(element);
        }
    }

    public boolean hasElement(String element) {
        for (String s : set) {
            if (s.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Set{" +
                "set=" + set +
                '}';
    }
}
