package org.jsoup.parser;

public class GeneratedTestGetTag {

    @Test
    public void testGetTag() {
        String tagName = "p";
        Map<String, Tag> tags = org.jsoup.parser.Element.tags;
        assert tags.containsKey(tagName) : "Tag not found: " + tagName;
    }

}