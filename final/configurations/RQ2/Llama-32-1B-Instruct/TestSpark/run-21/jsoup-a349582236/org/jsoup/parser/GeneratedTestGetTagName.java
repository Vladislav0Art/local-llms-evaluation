package org.jsoup.parser;

public class GeneratedTestGetTagName {

    @Test
    public void testGetTagName() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("name", "div");
        Tag tag = org.jsoup.parser.Tag.valueOf("div");
        assertEquals(expected.get("name"), tag.getName());
    }

}