package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

}