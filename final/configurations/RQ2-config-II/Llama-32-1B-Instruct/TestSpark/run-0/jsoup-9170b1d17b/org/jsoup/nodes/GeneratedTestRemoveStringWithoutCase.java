package org.jsoup.nodes;

public class GeneratedTestRemoveStringWithoutCase {

    private Attributes attributes;

    @Test
    public void testRemoveStringWithoutCase() {
        String key = "testKey";
        Object value = null;
        attributes.remove(key);
        assertNull(attributes.getUserData(key));
    }

}