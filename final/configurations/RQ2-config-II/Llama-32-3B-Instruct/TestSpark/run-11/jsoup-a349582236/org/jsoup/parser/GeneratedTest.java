package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedTest {

    @Test
    public void getNameEmptyTagTest() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

    @Test
    public void getNameNonEmptyTagTest() {
        Tag tag = new Tag();
        tag.setName("test");
        assertEquals("test", tag.getName());
    }

    @Test
    public void normalNameEmptyTagNameTest() {
        String tagName = "";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag.normalName());
    }

    @Test
    public void normalNameNonEmptyTagNameTest() {
        String tagName = "test";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag.normalName());
    }

    @Test
    public void isBlockBlankTagTest() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

    @Test
    public void isInlineSelfClosingTagTest() {
        Tag tag = new Tag();
        assertTrue(tag.isInline());
    }

    @Test
    public void isInlineNonSelfClosingTagTest() {
        Tag tag = new Tag();
        tag.setSelfClosing(false);
        assertFalse(tag.isInline());
    }

    @Test
    public void isBlockSelfClosingTagTest() {
        Tag tag = new Tag();
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockBlankTagTest() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlockNonEmptyTagTest() {
        Tag tag = new Tag();
        tag.setName("test");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isEmptyBlankTagTest() {
        Tag tag = new Tag();
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isEmptyNonBlankTagTest() {
        Tag tag = new Tag();
        tag.setName("test");
        false;
    }

    @Test
    public void isSelfClosingBlankTagTest() {
        Tag tag = new Tag();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isSelfClosingNonBlankTagTest() {
        Tag tag = new Tag();
        tag.setSelfClosing(false);
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagEmptyTagNameTest() {
        String tagName = "";
        assertTrue(Tag.isKnownTag(tagName));
    }

    @Test
    public void isKnownTagNonEmptyTagNameTest() {
        String tagName = "test";
        assertTrue(Tag.isKnownTag(tagName));
    }

    @Test
    public void preserveWhitespaceBlankTagTest() {
        Tag tag = new Tag();
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void preserveWhitespaceNonBlankTagTest() {
        Tag tag = new Tag();
        tag.setName("test");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedBlankTagTest() {
        Tag tag = new Tag();
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableNonEmptyTagNameTest() {
        Tag tag = new Tag();
        tag.setName("test");
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosingBlankTagTest() {
        Tag tag = new Tag();
        Tag result = tag.setSelfClosing();
        assertEquals(true, result);
    }

    @Test
    public void setSelfClosingNonBlankTagTest() {
        Tag tag = new Tag();
        tag.setSelfClosing(false);
        Tag result = tag.setSelfClosing();
        assertEquals(false, result);
    }

    @Test
    public void equalsSameTagTest() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag2.setName(tag1.getName());
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void equalsDifferentTagsTest() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void hashCodeSameTagTest() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag2.setName(tag1.getName());
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void hashCodeDifferentTagsTest() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertEquals(0, tag1.hashCode());
        assertEquals(0, tag2.hashCode());
    }

}