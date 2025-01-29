package org.jsoup.nodes;

public class GeneratedTestSize {

    @Test
    public void testSize() {
        Attributes attributes = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key2";

        attributes.put(key1, value1);
        attributes.put(key2, value2);

        assertEquals(0, attributes.size());

        // Add elements
        attributes.add(key1, value1);
        attributes.add(key2, value2);

        assertEquals(1, attributes.size());
    }

}