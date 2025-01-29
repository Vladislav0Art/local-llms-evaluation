package org.jsoup.nodes;

public class GeneratedTestGetAttributeTrueValue {

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
    public void testGetAttributeTrueValue() {
        this.attribute.put("key", "true");
        assertEquals(true, this.attribute.getAttribute("key").equals("true"));
    }

}