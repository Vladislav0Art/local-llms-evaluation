package org.jsoup.nodes;

public class GeneratedTestRemoveStringEquals {

    @Test
    public void testRemoveStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        Object value2 = 456;

        attributes.remove(key);
        attributes.remove(String.valueOf(key).equalsIgnoreCase("key"));

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

}