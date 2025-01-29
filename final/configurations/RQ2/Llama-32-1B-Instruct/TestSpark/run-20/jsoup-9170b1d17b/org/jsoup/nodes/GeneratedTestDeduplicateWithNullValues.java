package org.jsoup.nodes;

public class GeneratedTestDeduplicateWithNullValues {

    @Test
    public void testDeduplicateWithNullValues() {
        Attributes attributes = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key";

        attributes.put(key1, value1);
        attributes.put(key2, value2);

        Object value3 = null;

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());

        // Add an element to the map
        attributes.add(key1, value1);
        attributes.add(key2, value2);

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());
    }

}