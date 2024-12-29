package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag();
        assertEquals("", tag.normalName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = new Tag();
        assertEquals(tag, Tag.valueOf("", null));
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag();
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag();
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag();
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStaticTest() {
        assertFalse(Tag.isKnownTag(""));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag();
        assertFalse(tag.isFormListed());
    }

}