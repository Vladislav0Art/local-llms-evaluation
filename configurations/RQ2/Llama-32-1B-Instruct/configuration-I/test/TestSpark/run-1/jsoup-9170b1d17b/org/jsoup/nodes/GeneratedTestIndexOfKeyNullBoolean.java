package org.jsoup.nodes;

public class GeneratedTestIndexOfKeyNullBoolean {

    @Test
    public void testIndexOfKeyNullBoolean() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey(null));
        assertEquals(0, attributes.indexOfKey(false));
    }

}