package org.jsoup.parser;

public class GeneratedTestParseSettings {

    @Test
    public void testParseSettings() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("attributes", "");
        expected.put("content", null);
        Tag tag = org.jsoup.parser.Tag.valueOf("a");
        assertEquals(expected.get("attributes"), tag.getAttributes());
        assertEquals(expected.get("content"), tag.getContent());
    }

}