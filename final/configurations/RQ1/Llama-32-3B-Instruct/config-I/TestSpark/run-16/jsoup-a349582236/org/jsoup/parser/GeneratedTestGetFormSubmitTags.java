package org.jsoup.parser;

public class GeneratedTestGetFormSubmitTags {

    // Tests

    @Test
    public void testGetFormSubmitTags() {
        List<Tag> formSubmitTags = Tag.formSubmitTags;
        Assert.assertTrue(formSubmitTags.contains(Tag.tags.get("input")));
        Assert.assertTrue(formSubmitTags.contains(Tag.tags.get("textarea")));
    }
}

public class Tag {

    private final String tagName;

    public static Map<String, Tag> tags = new HashMap<>();

    // Constructor and methods
    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public boolean isBlock() {
        return false; // Not implemented yet
    }

    public void setBlock(boolean block) {
    }

    public boolean isEmpty() {
        return true; // Empty tags are always considered as empty
    }

    public void setEmpty(boolean empty) {
    }

    public boolean formatAsInline() {
        return false; // Not implemented yet
    }

    public void setFormatAsInline(boolean formatAsInline) {
    }

    public boolean formListed() {
        return false; // Form submit tags are not form listed by default
    }

    public void setFormListed(boolean formListed) {
    }

    public boolean formSubmit() {
        return false; // Not implemented yet
    }

    public void setFormSubmit(boolean formSubmit) {
    }

}