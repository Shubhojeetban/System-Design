package LRUAndLFU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU <K, V> extends LinkedHashMap<K, V> {
    int capacity;
    public LRU(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
