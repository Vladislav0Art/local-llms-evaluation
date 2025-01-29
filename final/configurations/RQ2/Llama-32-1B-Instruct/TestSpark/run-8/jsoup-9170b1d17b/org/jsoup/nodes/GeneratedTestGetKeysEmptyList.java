package org.jsoup.nodes;

public class GeneratedTestGetKeysEmptyList {

    private Attributes attribute;

    @Before
    public void setup() {
        this.attribute = new Attributes();
    }

    public Attributes getAttribute(String key) {
        return attribute.get(key);
    }

    public String getAttributeIgnoreCase(String key) {
        return attribute.getAttributeIgnoreCase(key);
    }

    public Object getUserData(String key) {
        return attribute.getUserData(key);
    }

    @Test
    public void testGetKeysEmptyList() {
        List<String> keys = new ArrayList<>();
        this.attribute.addAll(keys);
        assertEquals(0, this.attribute.size());
    }

    public Attributes addAttribute(String key, String value) {
        this.attribute.put(key, value);
        return this;
    }

}