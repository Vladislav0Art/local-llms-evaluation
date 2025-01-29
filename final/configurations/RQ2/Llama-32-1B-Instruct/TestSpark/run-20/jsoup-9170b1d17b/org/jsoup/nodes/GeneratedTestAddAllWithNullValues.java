package org.jsoup.nodes;

public class GeneratedTestAddAllWithNullValues {

    @Test
    public void testAddAllWithNullValues() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        String key2 = "key2";

        attributes.put(key, value);
        attributes.put(key2, value2);

        // Add elements from the second attribute
        attributes.addAll(attributes);

        assertEquals(1, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(true, attributes.isEmpty());
    }

}