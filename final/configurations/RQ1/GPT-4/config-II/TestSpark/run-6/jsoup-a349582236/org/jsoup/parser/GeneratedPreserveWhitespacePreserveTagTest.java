package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespacePreserveTagTest {

    @Test
    public void preserveWhitespacePreserveTagTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

}