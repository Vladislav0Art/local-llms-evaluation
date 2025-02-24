package org.jsoup.parser;

public class GeneratedTest {

    private static final String TAG_NAME = "div";
    private static final Tag tag = new Tag(TAG_NAME);
    private static final ParseSettings parseSettings = Mockito.mock(ParseSettings.class);

    @Test
    public void getNameTest() {
        assertEquals(TAG_NAME, tag.getName());
    }

    @Test
    public void normalNameTest() {
        assertEquals(TAG_NAME.toLowerCase(), tag.normalName());
    }

    @Test
    public void valueOfWithParseSettingsTest() {
        assertEquals(TAG_NAME, Tag.valueOf(TAG_NAME, parseSettings).getName());
    }

    @Test
    public void valueOfWithoutParseSettingsTest() {
        assertEquals(TAG_NAME, Tag.valueOf(TAG_NAME).getName());
    }

    @Test
    public void isBlockTest() {
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagWithTagNameTest() {
        assertTrue(Tag.isKnownTag(TAG_NAME));
    }

    @Test
    public void preserveWhitespaceTest() {
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        assertTrue(tag.isFormListed());
    }

}