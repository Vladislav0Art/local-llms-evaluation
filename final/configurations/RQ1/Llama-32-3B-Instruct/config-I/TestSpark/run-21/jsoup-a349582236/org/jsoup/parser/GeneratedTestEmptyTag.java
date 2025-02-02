package org.jsoup.parser;

public class GeneratedTestEmptyTag {

    @Test
    public void testEmptyTag() {
        String tagName = "";
        public static Map<String, Tag> getTags () {
            return org.jsoup.parser.Element.tags;
        }
        Map<String, Tag> tags = getTags();
        assert !tags.containsKey(tagName) : "No empty tag should be registered";
    }

    public static Map<String, Tag> getTagTags() {
        String tagName = "p";
        return org.jsoup.parser.Element.tags;
    }
}

}