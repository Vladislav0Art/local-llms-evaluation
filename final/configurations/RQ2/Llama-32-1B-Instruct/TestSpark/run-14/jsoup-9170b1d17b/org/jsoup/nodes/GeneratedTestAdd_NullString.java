package org.jsoup.nodes;

public class GeneratedTestAdd_NullString {

    private Attributes attributes;

    @Test
    public void testAdd_NullString() {
        attributes = new Attributes();
        String key = "testKey";
        Object value = null;
        attributes.add(key, value);
        assertNull(attributes.getUserData(key));
    }

}