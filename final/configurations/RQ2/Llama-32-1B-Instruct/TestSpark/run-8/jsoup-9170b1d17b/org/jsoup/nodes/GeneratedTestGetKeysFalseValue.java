package org.jsoup.nodes;

public class GeneratedTestGetKeysFalseValue {

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
    public void testGetKeysFalseValue() {
        List<String> keys = new ArrayList<>();
        keys.add("key=1");
        keys.add("");
        this.attribute.addAll(keys);
        assertEquals(2, this.attribute.size());
        assertTrue(this.attribute.getAttributesKey("key").isEmpty());
    }

}