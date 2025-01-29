package org.jsoup.nodes;

public class GeneratedTestDeduplicateWithNullValuesAndKeyEquals {

    @Test
    public void testDeduplicateWithNullValuesAndKeyEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        Object value2 = null;

        attributes.put(key, value);
        attributes.add(String.valueOf(key).equalsIgnoreCase("key"), value2);

        assertEquals(1, attributes.deduplicate(ParseSettings.of()).size());
    }

}