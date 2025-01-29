package org.jsoup.parser;

public class GeneratedTestValueOfTagName {

    @Before
    public void setup() {
    }

    @Test
    public void testValueOfTagName() {
        Map<String, Object> settings = new HashMap<>();
        settings.put(TAG_VALUE_OF, "tag");
        Tag tag = Tag.valueOf(tagName, settings);
        assertEquals("tag", tag.getName());
    }

}