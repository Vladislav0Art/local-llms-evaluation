package org.jsoup.parser;

public class GeneratedTestIsKnownTagNoMatch {

    @Test
    public void testIsKnownTagNoMatch() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_known_tag", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("p");
        assertFalse(tag.isKnownTag());
    }

}