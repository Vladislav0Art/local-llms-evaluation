package org.jsoup.nodes;

public class GeneratedTestIndexOfKeyBoolean {

    @Test
    public void testIndexOfKeyBoolean() {
        Attributes attributes = new Attributes(true);
        assertEquals(0, attributes.indexOfKey(true));
        assertEquals(1, attributes.indexOfKey(false));
    }

}