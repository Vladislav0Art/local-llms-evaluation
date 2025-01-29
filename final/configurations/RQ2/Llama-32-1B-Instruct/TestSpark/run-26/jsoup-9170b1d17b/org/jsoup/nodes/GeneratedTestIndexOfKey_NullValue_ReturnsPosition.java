package org.jsoup.nodes;

public class GeneratedTestIndexOfKey_NullValue_ReturnsPosition {

    private Attributes attributes;

    @Test
    public void testIndexOfKey_NullValue_ReturnsPosition() {
        attributes = new Attributes();
        assertEquals(0, attributes.indexOfKey(null));
    }

}