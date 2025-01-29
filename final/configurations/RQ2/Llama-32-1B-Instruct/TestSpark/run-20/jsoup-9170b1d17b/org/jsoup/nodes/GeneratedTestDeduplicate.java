package org.jsoup.nodes;

public class GeneratedTestDeduplicate {

    @Test
    public void testDeduplicate() {
        Attributes attributes1 = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key";

        attributes1.put(key1, value1);
        attributes1.put(key2, value2);

        Object value3 = 456;

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());

        // Add an element to the map
        attributes.add(key1, value1);
        attributes.add(key2, value2);

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());
    }

}