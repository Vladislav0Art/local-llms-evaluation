package org.jsoup.parser;

public class GeneratedTestFormatAsInlineTags {

    @Test
    public void testFormatAsInlineTags() {
        Tag tag = new Tag("test");
        tag.formatAsBlock = false;
        assertTrue(tag.formatAsBlock());
    }

}