package org.jsoup.nodes;

public class GeneratedTestAddStringWithoutCase {

    private Attributes attributes;

    @Test
    public void testAddStringWithoutCase() {
        String key = "testKey";
        String value = "";
        Attributes expected = new Attributes();
        expected.add(key, value);
        attributes.add(key, value);
        assertNotEquals(expected, attributes);
    }

}