package org.jsoup.nodes;

public class GeneratedTestIndexOfKeyNullString {

    @Test
    public void testIndexOfKeyNullString() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey(null));
        assertEquals(0, attributes.indexOfKey(""));
    }

}