package org.jsoup.parser;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_block", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("span");
        assertTrue(tag.isBlock());
    }

}