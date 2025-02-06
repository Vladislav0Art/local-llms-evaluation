package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

    @Test
    public void getNormalName_InvalidTagName_ReturnsEmptyString() {
        String invalidTagName = "invalid";
        Tag tag = new Tag();
        assertEquals(Validate.unsafeChar(invalidTagName), tag.normalName());
    }

    @Test
    public void getNormalName_ValidTagName_ReturnsValidName() {
        String validTagName = "<div>";
        Tag tag = new Tag();
        assertEquals(validTagName, tag.normalName());
    }

    @Test
    public void valueOf_UnknownTagName_ReturnsNull() {
        Tag tag = new Tag();
        assertNull(Tag.valueOf("unknown", Mockito.mock(ParseSettings.class)));
    }

    @Test
    public void valueOf_ValidTagName_ReturnsTag() {
        String validTagName = "<p>";
        Tag expectedTag = new Tag();
        // Assume implementation for equality check here
        assertEquals(expectedTag, Tag.valueOf(validTagName));
    }

    @Test
    public void isBlock_InlineTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

    @Test
    public void isInline_BlockTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void formatAsBlock_BlockTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void setSelfClosing_SettingSelfClosingReturnsNewTagWithSelfClosingFlag() {
        Tag originalTag = new Tag();
        Tag newTag = originalTag.setSelfClosing();
        assertTrue(newTag.isSelfClosing());
    }

}