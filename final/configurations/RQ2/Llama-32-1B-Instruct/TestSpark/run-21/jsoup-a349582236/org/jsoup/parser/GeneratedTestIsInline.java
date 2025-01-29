package org.jsoup.parser;

public class GeneratedTestIsInline {

    @Test
    public void testIsInline() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_inline", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

}