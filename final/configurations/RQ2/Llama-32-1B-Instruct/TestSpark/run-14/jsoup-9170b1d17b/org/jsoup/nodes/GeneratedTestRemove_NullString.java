package org.jsoup.nodes;

public class GeneratedTestRemove_NullString {

    private Attributes attributes;

    @Test
    public void testRemove_NullString() {
        attributes = new Attributes();
        String key = "testKey";
        Object value = null;
        attributes.remove(key);
        assertNull(attributes.getUserData(key));
    }

}