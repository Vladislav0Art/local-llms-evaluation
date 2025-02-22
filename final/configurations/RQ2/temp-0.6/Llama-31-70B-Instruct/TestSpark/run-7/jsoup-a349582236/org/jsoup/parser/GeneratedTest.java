package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void shouldReturnTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void shouldReturnNormalizedTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void shouldReturnTrueForBlockTag() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void shouldReturnFalseForBlockTag() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

    @Test
    public void shouldReturnTrueForFormatAsBlock() {
        Tag tag = new Tag("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void shouldReturnFalseForFormatAsBlock() {
        Tag tag = new Tag("span");
        assertFalse(tag.formatAsBlock());
    }

}