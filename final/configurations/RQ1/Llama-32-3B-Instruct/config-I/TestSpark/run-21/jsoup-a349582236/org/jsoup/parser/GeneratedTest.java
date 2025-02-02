package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testGetTag() {
        String tagName = "p";
        Map<String, Tag> tags = org.jsoup.parser.Element.tags;
        assert tags.containsKey(tagName) : "Tag not found: " + tagName;
    }

    @Test
    public void testGetEmptyTag() {
        String tagName = "";
        Map<String, Tag> tags = org.jsoup.parser.Element.tags;
        assert !tags.containsKey(tagName) : "No empty tag should be registered";
    }
}

@Test
public void testGetTags() {
    String tagName = "p";
    public static Tag getTag (String tagName){
        return org.jsoup.parser.Element.tags.get(tagName);
    }
    Tag tag = getTag(tagName);
    Map<String, Tag> tags = TagTests.getTagTags();
    assert tags.containsKey(tagName) : "Tag not found: " + tagName;
}

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

@Test
public void testGetEmptyTag() {
    String tagName = "";
    org.jsoup.parser.Element.getTags();
    assert false : "Empty tag should not be registered";
}

@Test
public void testGetTags() {
    String tagName = "p";
    org.jsoup.parser.Element.getTags();
    Tag tag = org.jsoup.parser.Element.getTag(tagName);
    Map<String, Tag> tags = org.jsoup.parser.Element.getTags();
    assert tags.containsKey(tagName) : "Tag not found: " + tagName;
}

}