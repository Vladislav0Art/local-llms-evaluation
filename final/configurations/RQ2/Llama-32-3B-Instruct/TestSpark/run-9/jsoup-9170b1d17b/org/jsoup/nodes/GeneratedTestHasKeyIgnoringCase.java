package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoringCase {

    private Attributes attributes = new Attributes();

    @Before
    public void setup() {
        attributes.putIgnoreCase("key", "value");
    }

    @Test
    public void testHasKeyIgnoringCase() {
        assertTrue(attributes.hasKeyIgnoreCase("KEY"));
    }

}