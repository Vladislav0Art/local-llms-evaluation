package org.jsoup.nodes;

public class GeneratedTestIndexOfKeyNotNull {

    @Test
    public void testIndexOfKeyNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.indexOfKey("key"));
        assertEquals(-1, attributes.indexOfKey(null));
    }

}