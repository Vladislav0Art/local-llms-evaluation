package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("tagname");
        String tagName = tag.getName();
        assertEquals("tagname", tagName);
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("TagName");
        String normalName = tag.normalName();
        assertEquals("tagname", normalName);
    }

    @Test
    public void valueOfDefinedTagsWithPreserveSettingsTest() {
        Tag tag = Tag.valueOf("p", new ParseSettings(true, true));
        assertEquals("P", tag.getName());
    }

    @Test
    public void valueOfUndefinedTagsWithPreserveSettingsTest() {
        Tag tag = Tag.valueOf("awesomeTag", new ParseSettings(true, true));
        assertEquals("awesomeTag", tag.getName());
    }

    @Test
    public void valueOfDefinedTagsWithoutPreserveSettingsTest() {
        Tag tag = Tag.valueOf("P", new ParseSettings(false, false));
        assertEquals("p", tag.getName());
    }

    @Test
    public void valueOfUndefinedTagsWithoutPreserveSettingsTest() {
        Tag tag = Tag.valueOf("AWESOMETAG", new ParseSettings(false, false));
        assertEquals("awesometag", tag.getName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("tag");
        assertEquals("tag", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("b");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("p"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

}