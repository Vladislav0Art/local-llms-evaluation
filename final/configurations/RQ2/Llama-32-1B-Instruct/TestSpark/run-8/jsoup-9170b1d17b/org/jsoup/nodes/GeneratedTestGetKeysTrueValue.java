package org.jsoup.nodes;

public class GeneratedTestGetKeysTrueValue {

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
    public void testGetKeysTrueValue() {
        List<String> keys = new ArrayList<>();
        keys.add("key=1");
        keys.add("key=2");
        this.attribute.addAll(keys);
        assertEquals(2, this.attribute.size());
        assertTrue(this.attribute.getAttributesKey("key").containsAll(keys));
    }

}