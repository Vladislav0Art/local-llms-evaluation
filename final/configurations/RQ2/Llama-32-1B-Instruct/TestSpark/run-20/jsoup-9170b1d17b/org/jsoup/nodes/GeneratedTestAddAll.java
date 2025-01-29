package org.jsoup.nodes;

public class GeneratedTestAddAll {

    @Test
    public void testAddAll() {
        Attributes attributes1 = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key2";

        attributes1.put(key1, value1);
        attributes1.put(key2, value2);

        // Add elements from the second attribute
        attributes.addAll(attributes1);

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(true, attributes.isEmpty());
    }

}