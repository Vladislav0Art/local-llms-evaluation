package org.jsoup.nodes;

public class GeneratedTestIndexOfKeyString {

    @Test
    public void testIndexOfKeyString() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("test"));
        assertEquals(0, attributes.indexOfKey("test"));
        assertEquals(-1, attributes.indexOfKey("non-existent"));
    }

}