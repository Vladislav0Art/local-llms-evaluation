package org.jsoup.parser;

public class GeneratedValueOf_UnknownTag_ReturnsGenericTag {

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
    public void valueOf_UnknownTag_ReturnsGenericTag() {
        ParseSettings settings = new ParseSettings(false);
        try {
            Tag tag = Tag.of("unknown", settings);
            assertNotNull(tag);
            assertFalse(Tag.isKnownTag("unknown"));
        } catch (RuntimeException e) {
            assertEquals("Unknown tag: unknown", e.getMessage());
        }
    }

}