package org.jsoup.nodes;

public class GeneratedTestHasKey {

    private Attributes attributes = new Attributes();

    @Before
    public void setup() {
        attributes.putIgnoreCase("key", "value");
    }

    @Test
    public void testHasKey() {
        assertTrue(attributes.hasKey("key"));
    }

}