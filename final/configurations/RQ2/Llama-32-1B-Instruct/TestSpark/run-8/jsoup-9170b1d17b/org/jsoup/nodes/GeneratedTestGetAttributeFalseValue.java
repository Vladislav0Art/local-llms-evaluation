package org.jsoup.nodes;

public class GeneratedTestGetAttributeFalseValue {

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
    public void testGetAttributeFalseValue() {
        this.attribute.put("key", false);
        assertEquals(false, this.attribute.getAttribute("key").equals("false"));
    }

}