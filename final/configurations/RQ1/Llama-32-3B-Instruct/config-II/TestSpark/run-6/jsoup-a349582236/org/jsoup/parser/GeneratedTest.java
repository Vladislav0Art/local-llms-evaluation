package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;
    private boolean isBlock;
    private boolean formatAsInline;
    private boolean preserveWhitespace;
    private boolean formList;
    private boolean formSubmit;

    public static final String BLOCK_TAGS = "blockTags";
    public static final String INLINE_TAGS = "inlineTags";
    public static final String EMPTY_TAGS = "emptyTags";
    public static final String FORMAT_AS_INLINE_TAGS = "formatAsInlineTags";
    public static final String PRESERVE_WHITESPACE_TAGS = "preserveWhitespaceTags";
    public static final String FORM_LISTED_TAGS = "formListedTags";
    public static final String FORM_SUBMIT_TAGS = "formSubmitTags";

    private Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public boolean formatAsInline() {
        return formatAsInline;
    }

    public void setFormatAsInline(boolean formatAsInline) {
        this.formatAsInline = formatAsInline;
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

    private static Map<String, Tag> tags = new HashMap<>();

    public static Tag getTag(String tagName) {
        return tags.get(tagName);
    }

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }
}

public class Main {

    @Test
    public void testBlockTags() {
        Assert.assertTrue(Tag.getBlockTags().contains("img"));
        Assert.assertFalse(Tag.getBlockTags().contains("a"));
    }

    @Test
    public void testInlineTags() {
        Assert.assertTrue(Tag.getInlineTags().contains("a"));
        Assert.assertFalse(Tag.getInlineTags().contains("img"));
    }

    @Test
    public void testEmptyTags() {
        Assert.assertTrue(Tag.getEmptyTags().contains("meta"));
        Assert.assertFalse(Tag.getEmptyTags().contains("a"));
    }

    @Test
    public void testFormatAsInlineTags() {
        Assert.assertTrue(Tag.formatAsInlineTags().contains("title"));
        Assert.assertFalse(Tag.formatAsInlineTags().contains("img"));
    }

    @Test
    public void testPreserveWhitespaceTags() {
        Assert.assertTrue(Tag.preserveWhitespaceTags().contains("pre"));
        Assert.assertFalse(Tag.preserveWhitespaceTags().contains("a"));
    }

}