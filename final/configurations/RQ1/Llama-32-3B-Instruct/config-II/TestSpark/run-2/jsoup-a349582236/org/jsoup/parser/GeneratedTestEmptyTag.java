package org.jsoup.parser;

public class GeneratedTestEmptyTag {

    private final String tagName;
    private boolean isBlock;
    private boolean formatAsInline;
    private boolean preserveWhitespace;
    private boolean formList;
    private boolean formSubmit;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    // getters and setters

    public static Map<String, Tag> tags = new HashMap<>();
}

public class TagFactory {

    public static Tag createBlockTag(String tagName) {
        Tag tag = new Tag(tagName);
        tag.isBlock = true;
        register(tag);
        return tag;
    }

    public static Tag createInlineTag(String tagName) {
        Tag tag = new Tag(tagName);
        tag.isBlock = false;
        tag.formatAsInline = true;
        register(tag);
        return tag;
    }

    public static Tag createEmptyTag(String tagName) {
        Tag tag = tags.get(tagName);
        Validate.notNull(tag);
        tag.empty = true;
        register(tag);
        return tag;
    }

    public static Tag createFormatAsInlineTag(String tagName) {
        Tag tag = tags.get(tagName);
        Validate.notNull(tag);
        tag.formatAsBlock = false;
        register(tag);
        return tag;
    }

    public static Tag createPreserveWhitespaceTag(String tagName) {
        Tag tag = tags.get(tagName);
        Validate.notNull(tag);
        tag.preserveWhitespace = true;
        register(tag);
        return tag;
    }

    public static Tag createFormListedTag(String tagName) {
        Tag tag = tags.get(tagName);
        Validate.notNull(tag);
        tag.formList = true;
        register(tag);
        return tag;
    }

    public static Tag createFormSubmitTag(String tagName) {
        Tag tag = tags.get(tagName);
        Validate.notNull(tag);
        tag.formSubmit = true;
        register(tag);
        return tag;
    }

    private static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }
}

public class TagTest {

    @Before
    public void setup() {
        // setup test data
    }

    @Test
    public void testEmptyTag() {
        // test empty tag functionality
    }

}