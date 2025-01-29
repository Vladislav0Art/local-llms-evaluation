package org.jsoup.nodes;

public class GeneratedTestCheckNotNull_NullValue {

    private Attributes attributes;

    @Test
    public void testCheckNotNull_NullValue() {
        attributes = new Attributes();
        String key = "testKey";
        String value = null;
        Object result = attributes.checkNotNull(value);
        assertEquals(String.valueOf(value), result);
    }

}