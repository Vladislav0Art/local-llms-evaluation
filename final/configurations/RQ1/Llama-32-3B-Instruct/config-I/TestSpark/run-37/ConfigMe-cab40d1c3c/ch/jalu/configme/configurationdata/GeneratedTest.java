package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String key;
    private String value;

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public boolean equals(Property other) {
        return Objects.equals(key, other.key);
    }
}

public class ArrayListStub {
    private List<Object> list;

    public ArrayListStub() {
        this.list = new ArrayList<>();
    }

    public void add(Object value) {
        this.list.add(value);
    }

    public List<Object> getList() {
        return list;
    }
}

public class MapUtil {
    public static <K, V> Map<K, V> singletonMap(K key, V value) {
        return Collections.singletonMap(key, value);
    }
}

public class RootEntriesMock {
    private Map<String, Object> entries;

    public RootEntriesMock() {
        this.entries = new HashMap<>();
    }

    public void addEntry(String key, Object value) {
        entries.put(key, value);
    }

    public Map<String, Object> getEntries() {
        return entries;
    }
}

public class GeneratedTest {

}