package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testGetTagName() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("name", "div");
        Tag tag = org.jsoup.parser.Tag.valueOf("div");
        assertEquals(expected.get("name"), tag.getName());
    }

    @Test
    public void testNormalName() {
        String tagName = "span";
        Tag tag = org.jsoup.parser.Tag.valueOf(tagName);
        String expected = "span";
        String actual = tag.normalName();
        assertNotEquals(expected, actual);
    }

    @Test
    public void testParseSettings() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("attributes", "");
        expected.put("content", null);
        Tag tag = org.jsoup.parser.Tag.valueOf("a");
        assertEquals(expected.get("attributes"), tag.getAttributes());
        assertEquals(expected.get("content"), tag.getContent());
    }

    @Test
    public void testIsBlock() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_block", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("span");
        assertTrue(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("format_as_block", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("div");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void testIsInline() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_inline", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void testIsEmpty() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("isEmpty", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_self_closing", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testIsKnownTag() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_known_tag", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("a");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void testIsKnownTagNoMatch() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_known_tag", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("p");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void testPreserveWhitespace() {
        String tagName = "p";
        Tag tag = org.jsoup.parser.Tag.valueOf(tagName);
        boolean result = tag.preserveWhitespace();
        assertTrue(result);
    }

    @Test
    public void testIsFormListed() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_form_listed", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("form");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void testIsFormSubmittable() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_form_submittable", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("form");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void testSetSelfClosing() {
        Tag originalTag = org.jsoup.parser.Tag.valueOf("div").setSelfClosing();
        assertFalse(originalTag.isBlock());
        assertTrue(originalTag.isInline());
        org.jsoup.parser.Tag.newBuilder().setName("img").setSelfClosing().apply(originalTag);
        assertTrue(originalTag.isBlock());
    }

}