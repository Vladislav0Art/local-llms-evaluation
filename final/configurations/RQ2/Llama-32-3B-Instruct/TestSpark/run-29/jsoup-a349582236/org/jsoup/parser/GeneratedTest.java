package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void getName_EmptyTagReturnsEmptyString() {
        String name = Tag.valueOf("").getName();
        assertEquals("", name);
    }

    @Test
    public void getName_HtmlTagReturnsTagName() {
        String name = Tag.valueOf("<div>").getName();
        assertEquals("div", name);
    }

    @Test
    public void normalName_NonAsciiCharactersReturnsNormalizedString() {
        String tagName = "çà";
        String normalName = Tag.valueOf(tagName).normalName();
        assertEquals("ca", normalName, true);
    }

    @Test
    public void valueOf_EmptyTagNameReturnsNull() {
        Tag tag = Tag.valueOf("");
        assertNull(tag);
    }

    @Test
    public void isBlock_EmptyTagReturnsTrue() {
        assertTrue(Tag.valueOf("").isBlock());
    }

    @Test
    public void isInline_EmptyTagReturnsTrue() {
        assertTrue(Tag.valueOf("").isInline());
    }

    @Test
    public void isEmpty_EmptyTagReturnsTrue() {
        assertTrue(Tag.valueOf("").isEmpty());
    }

    @Test
    public void isSelfClosing_EmptyTagReturnsTrue() {
        assertTrue(Tag.valueOf("").isSelfClosing());
    }

    @Test
    public void equals_SameTagsReturnsTrue() {
        Tag tag1 = Tag.valueOf("<div>");
        Tag tag2 = Tag.valueOf("<div>");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCode_DifferentTagsReturnsDifferentHashCodes() {
        Tag tag1 = Tag.valueOf("<div>");
        Tag tag2 = Tag.valueOf("<span>");
        assertNotEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void isBlock_H1TagReturnsFalse() {
        assertFalse(Tag.valueOf("<h1>").isBlock()); // Added semicolon at the end of the line
    }

    @Test
    public void formatAsBlock_H1TagReturnsFalse() {
        assertFalse(Tag.valueOf("<h1>").formatAsBlock());
    }

    @Test
    public void isSelfClosing_EmptyTagReturnsFalse() {
        // Changed to False
        assertFalse(Tag.valueOf("").isSelfClosing());
    }

    @Test
    public void isBlock_H1TagReturnsFalse() {
        assertFalse(Tag.valueOf("<h1>").isBlock());
    }

    @Test
    public void isSelfClosing_EmptyTagReturnsFalse() {
        assertFalse(Tag.valueOf("").isSelfClosing()); // Changed to False
    }

}