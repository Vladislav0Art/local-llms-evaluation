package org.jsoup.nodes;

public class GeneratedTestGetNullString {

    @Test
    public void testGetNullString() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get(null));
        assertNull(attributes.get(""));
    }

}