package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceTrueTest {

    @Test
    public void preserveWhitespaceTrueTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

}