package org.jsoup.parser;

public class GeneratedTestGetTags {

    @Test
    public void testGetTags() {
        String tagName = "p";
        org.jsoup.parser.Element.getTags();
        Tag tag = org.jsoup.parser.Element.getTag(tagName);
        Map<String, Tag> tags = org.jsoup.parser.Element.getTags();
        assert tags.containsKey(tagName) : "Tag not found: " + tagName;
    }

}