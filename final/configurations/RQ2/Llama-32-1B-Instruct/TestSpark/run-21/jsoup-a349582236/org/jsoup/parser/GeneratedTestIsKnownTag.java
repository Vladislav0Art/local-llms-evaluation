package org.jsoup.parser;

public class GeneratedTestIsKnownTag {

    @Test
    public void testIsKnownTag() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_known_tag", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("a");
        assertTrue(tag.isKnownTag());
    }

}