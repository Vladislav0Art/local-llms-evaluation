package org.jsoup.nodes;

public class GeneratedTestRemoveStringNotEquals {

    @Test
    public void testRemoveStringNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        String key2 = "key2";

        attributes.remove(key);
        attributes.remove(String.valueOf(key));

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

}