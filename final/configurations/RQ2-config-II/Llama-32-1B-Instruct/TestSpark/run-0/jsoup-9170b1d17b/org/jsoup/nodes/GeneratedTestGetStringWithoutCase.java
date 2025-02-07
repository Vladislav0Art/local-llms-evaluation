package org.jsoup.nodes;

public class GeneratedTestGetStringWithoutCase {

    private Attributes attributes;

    @Test
    public void testGetStringWithoutCase() {
        String key = "testKey";
        String expected = "TESTKEY";
        String actual = attributes.get(key);
        assertEquals(expected, actual);
    }

}