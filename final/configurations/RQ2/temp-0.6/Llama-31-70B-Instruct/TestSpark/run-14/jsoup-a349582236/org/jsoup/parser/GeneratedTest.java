package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private Tag tag;

    @BeforeEach
    public void setUp() {
        tag = new Tag("div");
    }

    @Test
    public void getNameTest() {
        assertEquals(tag.tagName, tag.getName());
    }

    @Test
    public void getNameNormalNameTest() {
        assertEquals(tag.normalName, tag.normalName());
    }

    @Test
    public void isBlockTest() {
        assertEquals(tag.isBlock, tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        assertEquals(tag.formatAsBlock, tag.formatAsBlock());
    }

    @Test
    public void isEmptyTest() {
        assertEquals(tag.empty, tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        assertEquals(tag.selfClosing, tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        assertEquals(tag.tags.containsKey(tag.tagName), tag.isKnownTag());
    }

    @Test
    public void isKnownTagTagNameTest() {
        assertEquals(tag.tags.containsKey("div"), tag.isKnownTag("div"));
    }

    @Test
    public void preserveWhitespaceTest() {
        assertEquals(tag.preserveWhitespace, tag.preserveWhitespace());
    }

}