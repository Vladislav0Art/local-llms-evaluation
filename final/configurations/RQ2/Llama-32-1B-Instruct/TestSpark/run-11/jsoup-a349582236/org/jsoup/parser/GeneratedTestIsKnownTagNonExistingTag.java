package org.jsoup.parser;

public class GeneratedTestIsKnownTagNonExistingTag {

    @Before
    public void setup() {
    }

    @Test
    public void testIsKnownTagNonExistingTag() {
        Map<String, Object> settings = new HashMap<>();
        settings.put(TAG_VALUE_OF, "non-existent-tag");
        Tag tag = Tag.valueOf(tagName, settings);
        assertFalse(tag.isKnownTag());
    }

}