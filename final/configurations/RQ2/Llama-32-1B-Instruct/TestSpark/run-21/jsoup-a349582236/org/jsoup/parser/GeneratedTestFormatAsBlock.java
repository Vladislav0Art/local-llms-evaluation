package org.jsoup.parser;

public class GeneratedTestFormatAsBlock {

    @Test
    public void testFormatAsBlock() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("format_as_block", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("div");
        assertFalse(tag.formatAsBlock());
    }

}