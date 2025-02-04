package org.jsoup.parser;

public class GeneratedTestFormSubmitSetting {

    private final String tagName;
    private boolean isBlock = true;
    private boolean formatAsInline = false;
    private boolean preserveWhitespace = false;
    private boolean formList = false;
    private boolean formSubmit = false;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public void setFormatAsInline(boolean formatAsInline) {
        formatAsInline = formatAsInline;
    }

    public void setPreserveWhitespace(boolean preserveWhitespace) {
        this.preserveWhitespace = preserveWhitespace;
    }

    public void setFormList(boolean formList) {
        this.formList = formList;
    }

    public void setFormSubmit(boolean formSubmit) {
        this.formSubmit = formSubmit;
    }

    @Override
    public String toString() {
        return tagName;
    }
}

public class TagRegistry {

    private final Map<String, Tag> tags;

    public TagRegistry() {
        tags = new HashMap<>();
    }

    public void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    public Tag get(String tagName) {
        return tags.get(tagName);
    }
}

public class Main {

    @Test
    public void testFormSubmitSetting() {
        String tagName = "test";
        Tag tag = new Tag(tagName);
        tag.setFormSubmit(true);
        assertTrue(tag.formSubmit);
    }

}