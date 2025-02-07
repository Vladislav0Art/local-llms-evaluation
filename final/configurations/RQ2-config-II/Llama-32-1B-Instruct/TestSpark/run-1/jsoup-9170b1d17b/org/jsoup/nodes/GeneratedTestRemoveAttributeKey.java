package org.jsoup.nodes;

public class GeneratedTestRemoveAttributeKey {

    @Test
    public void testRemoveAttributeKey() {
        String key = "test";
        Attributes attributes = new Attributes();
        attributes.put(String.valueOf(key), null);
        assertNull(attributes.getUserData(key));
    }

}