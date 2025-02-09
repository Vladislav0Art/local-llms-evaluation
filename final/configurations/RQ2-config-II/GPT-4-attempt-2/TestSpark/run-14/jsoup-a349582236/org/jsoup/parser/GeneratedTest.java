package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameValidInputTest() {
        Tag tag = Tag.valueOf("tag_name");
        assertEquals("tag_name", tag.getName());
    }

    @Test
    public void normalNameValidInputTest() {
        Tag tag = Tag.valueOf("TaG_NaMe");
        assertEquals("tag_name", tag.normalName());
    }

    @Test
    public void valueOfValidInputWithoutSettingsTest() {
        Tag tag = Tag.valueOf("tag_name");
        assertEquals("tag_name", tag.getName());
    }

    @Test
    public void valueOfValidInputWithSettingsTest() {
        Tag tag = Tag.valueOf("tag_name", ParseSettings.preserveCase);
        assertEquals("tag_name", tag.getName());
    }

    @Test
    public void isBlockValidInputTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockValidInputTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineValidInputTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyValidInputTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingValidInputTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagValidInputTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void preserveWhitespaceValidInputTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedValidInputTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableValidInputTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosingValidInputTest() {
        Tag tag = Tag.valueOf("tag_name").setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsValidInputTest() {
        Tag tag1 = Tag.valueOf("tag_name");
        Tag tag2 = Tag.valueOf("tag_name");
        assertEquals(tag1, tag2);
    }

    @Test
    public void hashCodeValidInputTest() {
        Tag tag = Tag.valueOf("tag_name");
        int expectedHashCode = "tag_name".hashCode();
        assertEquals(expectedHashCode, tag.hashCode());
    }

    @Test
    public void toStringValidInputTest() {
        Tag tag = Tag.valueOf("tag_name");
        assertEquals("<tag_name>", tag.toString());
    }

    @Test
    public void cloneValidInputTest() {
        Tag tag = Tag.valueOf("tag_name");
        Tag clonedTag = tag.clone();
        assertEquals(tag, clonedTag);
    }

}