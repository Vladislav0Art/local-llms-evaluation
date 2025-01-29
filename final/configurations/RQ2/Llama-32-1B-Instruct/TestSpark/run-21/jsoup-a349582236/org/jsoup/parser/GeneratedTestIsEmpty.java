package org.jsoup.parser;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("isEmpty", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

}