package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, Object> map;

    public PropertyListBuilder() {
        this.map = new HashMap<>();
    }

    public void setMapToString() {
        for (Object entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public void addEntry(String key, String value) {
        map.put(key, value);
    }
}

public class TestPropertyListBuilder {
    private PropertyListBuilder builder;

    public TestPropertyListBuilder() {
        this.builder = new PropertyListBuilder();
    }

}