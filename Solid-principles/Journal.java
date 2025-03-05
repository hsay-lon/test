
import java.util.*;

class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);

    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);

    }

}

class Demo {

    public static void main(String[] args) {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("akdfi");
        System.err.println(j);
    }
}
