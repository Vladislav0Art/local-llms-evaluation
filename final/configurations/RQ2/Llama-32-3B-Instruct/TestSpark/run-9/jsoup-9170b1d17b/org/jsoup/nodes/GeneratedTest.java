package org.jsoup.nodes;

public class GeneratedTest {

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

    public void remove(String key) {
        attributeMap.remove(key.toLowerCase());
    }
}

public class GeneratedTest {

    private Attributes attributes = new Attributes();

    @Before
    public void setup() {
        attributes.putIgnoreCase("key", "value");
    }

    @Test
    public void indexOfKey_EmptyString_ReturnsMinusOne() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey(""));
    }

    @Test
    public void get_NullValue_ReturnsNull() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("key"));
    }

    @Test
    public void checkNotNull_NullValue_ReturnsEmptyString() {
        String result = Attributes.checkNotNull(null);
        assertEquals("", result);
    }

    @Test
    public void getIgnoreCase_EmptyKey_ReturnsNull() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getIgnoreCase(""));
    }

    @Test
    public void hasKey_EmptyString_ReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey(""));
    }

    @Test
    public void putBooleanValue_PuttingFalse_SetsAttributesAsFalse() {
        Attributes attributes = new Attributes();
        attributes.put("key", false);
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void normalize_NonEmptyString_UpdatesKeyWithLowerCase() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();
        assertEquals("key", attributes.get("KEY"));
    }

}