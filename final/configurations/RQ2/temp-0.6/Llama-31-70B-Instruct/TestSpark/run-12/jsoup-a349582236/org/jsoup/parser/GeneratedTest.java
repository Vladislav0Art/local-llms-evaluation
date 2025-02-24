package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag();
        String expectedName = "expectedName";
        assertEquals(expectedName, tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag();
        String expectedName = "expectedName";
        assertEquals(expectedName, tag.normalName());
    }

    @Test
    public void valueOfTagNameSettingsTest() {
        String tagName = "tagName";
        ParseSettings settings = new ParseSettings();
        Tag expectedTag = new Tag();
        assertEquals(expectedTag, Tag.valueOf(tagName, settings));
    }

    @Test
    public void valueOfTagNameTest() {
        String tagName = "tagName";
        Tag expectedTag = new Tag();
        assertEquals(expectedTag, Tag.valueOf(tagName));
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag();
        boolean expectedBlock = true;
        assertEquals(expectedBlock, tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag();
        boolean expectedFormatAsBlock = true;
        assertEquals(expectedFormatAsBlock, tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag();
        boolean expectedInline = true;
        assertEquals(expectedInline, tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag();
        boolean expectedEmpty = true;
        assertEquals(expectedEmpty, tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag();
        boolean expectedSelfClosing = true;
        assertEquals(expectedSelfClosing, tag.isSelfClosing());
    }

}