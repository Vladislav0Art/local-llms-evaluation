package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;
    private boolean isBlock = false;
    private boolean formatAsBlock = false;
    private boolean empty = false;
    private boolean preserveWhitespace = false;
    private boolean formList = false;
    private boolean formSubmit = false;

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setFormatAsBlock(boolean formatAsBlock) {
        this.formatAsBlock = formatAsBlock;
    }

    public boolean isFormatAsBlock() {
        return formatAsBlock;
    }

    public void isEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setPreserveWhitespace(boolean preserveWhitespace) {
        this.preserveWhitespace = preserveWhitespace;
    }

    public boolean preserveWhitespace() {
        return preserveWhitespace;
    }

    public void setFormList(boolean formList) {
        this.formList = formList;
    }

    public boolean isFormList() {
        return formList;
    }

    public void setFormSubmit(boolean formSubmit) {
        this.formSubmit = formSubmit;
    }

    public boolean isFormSubmit() {
        return formSubmit;
    }
}

public class Element {
    public static java.util.HashMap<String, Tag> tags = new java.util.HashMap<>();

    public static void put(String tagName, Tag tag) {
        tags.put(tagName, tag);
    }

    public static int size() {
        return tags.size();
    }
}

public class Main {

    @Test
    public void testRegister() {
        // given
        Tag tag1 = new Tag();
        tag1.setTagName("div");
        Tag tag2 = new Tag();
        tag2.setTagName("span");

        // when
        Element.tags.put(tag1.getTagName(), tag1);
        Element.tags.put(tag2.getTagName(), tag2);

        // then
        assertEquals(2, Element.size());
    }

    @Test
    public void testIsBlock() {
        // given
        Tag tag = new Tag();
        tag.setTagName("p");

        // when
        tag.setBlock(true);
        tag.setFormatAsBlock(false);

        // then
        assertTrue(tag.isBlock());
        assertFalse(tag.isFormatAsBlock());
    }

    @Test
    public void testEmpty() {
        // given
        Tag tag = new Tag();
        tag.setTagName("meta");

        // when
        tag.isEmpty(true);

        // then
        assertTrue(tag.isEmpty());
    }

    @Test
    public void testPreserveWhitespace() {
        // given
        Tag tag = new Tag();
        tag.setTagName("pre");

        // when
        tag.setPreserveWhitespace(true);

        // then
        assertTrue(tag.preserveWhitespace);
    }

    @Test
    public void testFormList() {
        // given
        Tag tag = new Tag();
        tag.setTagName("button");

        // when
        tag.setFormList(true);

        // then
        assertTrue(tag.isFormList());
    }

    @Test
    public void testFormSubmit() {
        // given
        Tag tag = new Tag();
        tag.setTagName("input");

        // when
        tag.setFormSubmit(true);

        // then
        assertTrue(tag.isFormSubmit());
    }

}