package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        assertEquals(true, tag.isBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("span");
        assertEquals(false, tag.isBlock());
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        assertEquals(true, tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag("button");
        assertEquals(true, tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = new Tag("input");
        assertEquals(true, tag.isFormSubmittable());
    }

    @Test
    public void isKnownTagTest() {
        assertEquals(true, Tag.isKnownTag("div"));
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertEquals("div", tag.getName());
    }

}