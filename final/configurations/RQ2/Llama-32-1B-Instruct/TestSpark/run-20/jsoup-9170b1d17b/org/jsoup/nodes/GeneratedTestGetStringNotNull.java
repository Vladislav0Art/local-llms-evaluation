package org.jsoup.nodes;

public class GeneratedTestGetStringNotNull {

    @Test
    public void testGetStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        assertEquals(null, attributes.get(key));
        assertEquals("value", attributes.get(String.valueOf(key)));
    }

}