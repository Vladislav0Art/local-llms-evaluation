package org.jsoup.nodes;

public class GeneratedTestRemoveStringNotNull {

    @Test
    public void testRemoveStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";

        attributes.remove(key);
        assertEquals(value, attributes.getUserData(key));

        attributes.removeIgnoreCase(key);
        assertEquals(0, attributes.getUserData(key));
    }

}