package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        Tag tagNeedsWhitespace = Tag.valueOf("pre");
        assertTrue(tagNeedsWhitespace.preserveWhitespace());
        Tag tagNotNeedWhitespace = Tag.valueOf("div");
        assertFalse(tagNotNeedWhitespace.preserveWhitespace());
    }

}