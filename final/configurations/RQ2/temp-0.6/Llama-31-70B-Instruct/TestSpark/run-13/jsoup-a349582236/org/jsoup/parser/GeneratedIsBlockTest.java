package org.jsoup.parser;

public class GeneratedIsBlockTest {

    private Tag tag;

    private static final String TAG_NAME = "div";
    private static final String NORMAL_TAG_NAME = "div";
    private static final ParseSettings PARSE_SETTINGS = new ParseSettings(false, false);
    private static final Tag TAG_VALUE = new Tag(TAG_NAME);
    private static final Tag TAG_VALUE_WITH_SETTINGS = new Tag(TAG_NAME, PARSE_SETTINGS);
    private static final boolean FORMAT_AS_BLOCK = true;
    private static final boolean IS_INLINE = true;
    private static final boolean IS_EMPTY = true;
    private static final boolean IS_SELF_CLOSING = true;
    private static final boolean IS_KNOWN_TAG = true;
    private static final boolean PRESERVE_WHITESPACE = true;
    private static final boolean IS_FORM_LISTED = true;
    private static final boolean IS_FORM_SUBMITTABLE = true;
    private static final Tag SELF_CLOSING_TAG = new Tag(TAG_NAME).setSelfClosing();

    @Test
    public void isBlockTest() {
        assertEquals(FORMAT_AS_BLOCK, tag.isBlock());
    }

}