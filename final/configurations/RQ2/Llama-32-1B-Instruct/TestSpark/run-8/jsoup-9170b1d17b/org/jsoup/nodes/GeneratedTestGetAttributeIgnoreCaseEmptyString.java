package org.jsoup.nodes;

public class GeneratedTestGetAttributeIgnoreCaseEmptyString {

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
    public void testGetAttributeIgnoreCaseEmptyString() {
        this.attribute.put("key", "");
        assertEquals("", this.attribute.getAttributeIgnoreCase("key"));
    }

    public String getAttributesKey(String key) {
        return attribute.getKey(key);
    }

    public String getAttributesKeyIgnoreCase(String key) {
        return attribute.getKeyIgnoreCase(key);
    }

}