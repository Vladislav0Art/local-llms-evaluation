package org.jsoup.nodes;

public class GeneratedTestIndexOfKey_ReturnsPosition {

    private Attributes attributes;

    @Test
    public void testIndexOfKey_ReturnsPosition() {
        attributes = new Attributes();
        assertEquals(0, attributes.indexOfKey("key1"));
        assertEquals(-1, attributes.indexOfKey(""));
    }

}