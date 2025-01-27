package org.jsoup.nodes;

public class GeneratedTestRemoveNullKey {

    private Attributes attributes = new Attributes();

    @Before
    public void setup() {
        attributes.putIgnoreCase("key", "value");
    }

    @Test
    public void testRemoveNullKey() {
        attributes.remove(null);
    }
}

public class Attributes {
    private Map<String, String> attributeMap = new HashMap<>();

    public void putIgnoreCase(String key, String value) {
        attributeMap.put(key.toLowerCase(), value);
    }

    public String getIgnoreCase(String key) {
        return attributeMap.getOrDefault(key.toLowerCase(), "");
    }

    public boolean hasKey(String key) {
        return attributeMap.containsKey(key.toLowerCase());
    }

    public boolean hasKeyIgnoreCase(String key) {
        return hasKey(key.toLowerCase());
    }

    public Attributes putIgnoreCase(String key, String value) {
        putIgnoreCase(key, value);
        return this;
    }

    public void remove(String key) {
        attributeMap.remove(key.toLowerCase());
    }

}