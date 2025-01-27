package org.jsoup.nodes;

public class GeneratedTestRemoveKey {

    private Attributes attributes = new Attributes();

    @Before
    public void setup() {
        attributes.putIgnoreCase("key", "value");
    }

    @Test
    public void testRemoveKey() {
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

}