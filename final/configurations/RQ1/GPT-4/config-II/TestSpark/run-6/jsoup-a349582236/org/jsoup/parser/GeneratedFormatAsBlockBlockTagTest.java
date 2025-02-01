package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockBlockTagTest {

    @Test
    public void formatAsBlockBlockTagTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

}