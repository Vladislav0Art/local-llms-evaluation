package org.jsoup.parser;

public class GeneratedTestElementToString {

    @Test
    public void testElementToString() {
        String tagName = "div";
        Element element = new Element(tagName);
        assertEquals(tagName, element.toString());
    }
}

public class Tag {
    private final String tagName;
    private boolean isBlock = false;
    private boolean formatAsBlock = false;
    private boolean preserveWhitespace = false;
    private boolean formList = false;
    private boolean formSubmit = false;

    public static Map<String, Tag> tags = new HashMap<>();

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public boolean formatAsBlock() {
        return formatAsBlock;
    }

    public void setFormatAsBlock(boolean formatAsBlock) {
        this.formatAsBlock = formatAsBlock;
    }

    public boolean preserveWhitespace() {
        return preserveWhitespace;
    }

    public void setPreserveWhitespace(boolean preserveWhitespace) {
        this.preserveWhitespace = preserveWhitespace;
    }

    public boolean formList() {
        return formList;
    }

    public void setFormList(boolean formList) {
        this.formList = formList;
    }

    public boolean formSubmit() {
        return formSubmit;
    }

    public void setFormSubmit(boolean formSubmit) {
        this.formSubmit = formSubmit;
    }
}

public class Element {
    private final String tagName;

    public Element(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return tagName;
    }

}