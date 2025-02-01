package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockInlineTagTest {

    @Test
    public void formatAsBlockInlineTagTest() {
        Tag tag = Tag.valueOf("a");
        assertFalse(tag.formatAsBlock());
    }

}