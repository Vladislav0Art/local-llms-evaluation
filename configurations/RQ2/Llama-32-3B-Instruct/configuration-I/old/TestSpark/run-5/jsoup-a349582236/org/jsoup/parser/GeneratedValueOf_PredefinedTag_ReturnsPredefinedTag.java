package org.jsoup.parser;

public class GeneratedValueOf_PredefinedTag_ReturnsPredefinedTag {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class TagTest {

    @Test
    public void valueOf_PredefinedTag_ReturnsPredefinedTag() {
        ParseSettings settings = new ParseSettings(true);
        Tag tag = Tag.of("p", settings);
        assertNotNull(tag);
        assertTrue(Tag.isKnownTag("p"));
    }

}