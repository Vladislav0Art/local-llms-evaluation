package org.jsoup.nodes;

public class GeneratedPutIgnoreCase_NullValue_ReturnsNull {

    @Test
    public void putIgnoreCase_NullValue_ReturnsNull() {
        Attributes attributes = new Attributes();
        assertNull(attributes.putIgnoreCase("key", null));
    }

}