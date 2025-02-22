package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.ParseSettings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private static final Map<String, Tag> tags = new HashMap<>();
    private Tag tag;

    @BeforeEach
    public void setUp() {
        tags.clear();
        tag = new Tag("p");
    }

    @Test
    public void getTagName() {
        assertEquals("p", tag.getName());
    }

    @Test
    public void getNormalName() {
        assertEquals("p", tag.normalName());
    }

    @Test
    public void isBlock() {
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlock() {
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isEmpty() {
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosing() {
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag() {
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void preserveWhitespace() {
        assertFalse(tag.preserveWhitespace());
    }

}