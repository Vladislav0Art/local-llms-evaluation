package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testRegisterTag() {
        String tagName = "test";
        Tag tag = new Tag(tagName);
        Tag registeredTag = Tag.tags.get(tagName);
        assertNotNull(registeredTag);
    }

    @Test
    public void testFormatAsInlineTags() {
        Tag tag = new Tag("test");
        tag.formatAsBlock = false;
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void testPreserveWhitespaceTags() {
        Tag tag = new Tag("test");
        tag.preserveWhitespace = true;
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void testFormListedTags() {
        Tag tag = new Tag("test");
        tag.formList = true;
        assertTrue(tag.formList());
    }

    @Test
    public void testFormSubmitTags() {
        Tag tag = new Tag("test");
        tag.formSubmit = true;
        assertTrue(tag.formSubmit());
    }
}

@Test
public void testElementConstructor() {
    String tagName = "div";
    Element element = new Element(tagName);
    assertNotNull(element);
}

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