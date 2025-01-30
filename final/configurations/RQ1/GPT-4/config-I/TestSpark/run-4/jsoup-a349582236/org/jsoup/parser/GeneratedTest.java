package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("P", tag.normalName());
    }

    @Test
    public void valueOfSensitiveCaseTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("P", tag.getName());
    }

    @Test
    public void valueOfInsensitiveCaseTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.preserveCase);
        assertEquals("P", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("meta");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("meta");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTrueTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(Tag.isKnownTag(tag.getName()));
    }

    @Test
    public void isKnownTagFalseTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("title");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("button");
        assertEquals("button", tag.toString());
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("button");
        assertEquals(tag, tag.clone());
    }

}