package org.jsoup.parser;

public class GeneratedTestIsKnownTag {

    @Before
    public void setup() {
    }

    @Test
    public void testIsKnownTag() {
        Map<String, Object> settings = new HashMap<>();
        settings.put(TAG_VALUE_OF, "tag");
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.isKnownTag());
    }

}