package org.jsoup.nodes;

public class GeneratedTestAddStringEquals {

    @Test
    public void testAddStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        Object value2 = 456;

        attributes.put(key, value);
        attributes.put(String.valueOf(key).equalsIgnoreCase("key"), value2);

        assertEquals(1, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(true, attributes.isEmpty());
    }

}