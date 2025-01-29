package org.jsoup.nodes;

public class GeneratedTestAddAttributeFalseValue {

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
    public void testAddAttributeFalseValue() {
        this.addAttribute("key", false);
        assertEquals(false, this.attribute.getAttributes().containsKey("key"));
    }

}