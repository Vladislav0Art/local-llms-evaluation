package org.jsoup.nodes;

public class GeneratedTestAddAttributeTrueValue {

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
    public void testAddAttributeTrueValue() {
        this.addAttribute("key", "true");
        assertEquals(true, this.attribute.getAttributes().containsKey("key"));
    }

}