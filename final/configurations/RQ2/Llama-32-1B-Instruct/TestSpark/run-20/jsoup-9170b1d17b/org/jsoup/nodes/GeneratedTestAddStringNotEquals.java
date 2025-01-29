package org.jsoup.nodes;

public class GeneratedTestAddStringNotEquals {

    @Test
    public void testAddStringNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;

        attributes.put(key, value);
        attributes.add(String.valueOf(key), value2);

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

}