package org.jsoup.nodes;

public class GeneratedTestRemoveStringKey {

    @Test
    public void testRemoveStringKey() {
        String key = "test";
        Object value = null;
        Attributes attributes = new Attributes();
        attributes.remove(key);
        assertNull(attributes.getUserData(key));
    }

}