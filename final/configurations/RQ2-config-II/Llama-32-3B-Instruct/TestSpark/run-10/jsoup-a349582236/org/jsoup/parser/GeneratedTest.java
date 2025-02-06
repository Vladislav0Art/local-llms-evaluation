package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getName_SimpleTag_ReturnsTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void normalName_DivTag_ReturnsDiv() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        assertEquals(tagName, tag.normalName());
    }

    @Test
    public void isKnownTag_SimpleTags_ReturnsTrue() {
        assertTrue(Tag.isKnownTag("img"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

    @Test
    public void valueOf_SimpleTag_ReturnsTagInstance() {
        Tag tag = Tag.valueOf("p");
        assertNotNull(tag);
    }

    @Test
    public void isBlock_AmpTag_ReturnsFalse() {
        assertTrue(Tag.formatAsBlock());
    }

    @Test
    public void isEmpty_EmptyTags_ReturnsTrue() {
        assertFalse(Tag.isEmpty(""));
        assertTrue(Tag.isEmpty("<"));
    }

    @Test
    public void formatAsBlock_AmpTag_ReturnsTrue() {
        assertTrue(Tag.formatAsBlock());
    }

    @Test
    public void isInline_SimpleTags_ReturnsTrue() {
        assertTrue(Tag.isInline("img"));
    }

    @Test
    public void setSelfClosing_SelfClosingTags_ReturnsTagInstance() {
        Tag tag = new Tag("input");
        Tag result = tag.setSelfClosing();
        assertNotNull(result);
    }

    @Test
    public void clone_CloneOfSameTag_ReturnsSameTag() {
        Tag tag1 = new Tag("div");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

    @Test
    public void preserveWhitespace_SimpleTags_ReturnsTrue() {
        assertTrue(Tag.preserveWhitespace());
    }

}