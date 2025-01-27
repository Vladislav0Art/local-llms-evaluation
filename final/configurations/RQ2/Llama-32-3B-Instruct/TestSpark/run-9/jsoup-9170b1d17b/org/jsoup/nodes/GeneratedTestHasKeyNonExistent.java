package org.jsoup.nodes;

public class GeneratedTestHasKeyNonExistent {

    private Attributes attributes = new Attributes();

    @Before
    public void setup() {
        attributes.putIgnoreCase("key", "value");
    }

    @Test
    public void testHasKeyNonExistent() {
        assertFalse(attributes.hasKey("non-existent-key"));
    }

}