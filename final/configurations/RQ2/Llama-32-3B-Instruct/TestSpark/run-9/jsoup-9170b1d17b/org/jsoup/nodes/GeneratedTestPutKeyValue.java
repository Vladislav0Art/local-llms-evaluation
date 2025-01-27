package org.jsoup.nodes;

public class GeneratedTestPutKeyValue {

    private Attributes attributes = new Attributes();

    @Before
    public void setup() {
        attributes.putIgnoreCase("key", "value");
    }

    @Test
    public void testPutKeyValue() {
        attributes.putIgnoreCase("key", "newValue");
        assertEquals("newValue", attributes.getIgnoreCase("key"));
    }

}