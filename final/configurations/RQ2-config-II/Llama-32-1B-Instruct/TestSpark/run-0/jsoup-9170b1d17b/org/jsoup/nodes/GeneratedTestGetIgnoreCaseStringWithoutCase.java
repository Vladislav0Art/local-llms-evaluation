package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCaseStringWithoutCase {

    private Attributes attributes;

    @Test
    public void testGetIgnoreCaseStringWithoutCase() {
        String key = "testkey";
        String expected = "testKEY";
        String actual = attributes.getIgnoreCase(key);
        assertEquals(expected, actual);
    }

}