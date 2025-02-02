package org.jsoup.parser;

public class GeneratedTestGetFormatAsInlineTags {

    // Tests

    @Test
    public void testGetFormatAsInlineTags() {
        List<Tag> formatAsInlineTags = Tag.formatAsInlineTags;
        Assert.assertTrue(formatAsInlineTags.contains(Tag.tags.get("title")));
        Assert.assertTrue(formatAsInlineTags.contains(Tag.tags.get("a")));
    }

}