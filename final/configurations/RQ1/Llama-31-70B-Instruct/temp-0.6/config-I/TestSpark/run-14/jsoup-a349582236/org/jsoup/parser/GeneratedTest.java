package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void shouldReturnBlockTag() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void shouldReturnInlineTag() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.isBlock());
    }

    @Test
    public void shouldPreserveWhitespaceInScriptAndStyleTags() {
        Tag scriptTag = Tag.valueOf("script");
        assertTrue(scriptTag.preserveWhitespace());
        Tag styleTag = Tag.valueOf("style");
        assertTrue(styleTag.preserveWhitespace());
    }

    @Test
    public void shouldNotPreserveWhitespaceInNonScriptAndStyleTags() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.preserveWhitespace());
        Tag spanTag = Tag.valueOf("span");
        assertFalse(spanTag.preserveWhitespace());
    }

    @Test
    public void shouldReturnFormListedTag() {
        Tag inputTag = Tag.valueOf("input");
        assertTrue(inputTag.isFormListed());
        Tag selectTag = Tag.valueOf("select");
        assertTrue(selectTag.isFormListed());
    }

    @Test
    public void shouldNotReturnFormListedTag() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.isFormListed());
        Tag spanTag = Tag.valueOf("span");
        assertFalse(spanTag.isFormListed());
    }

}