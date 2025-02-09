package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedFormatAsBlockFalseTest {

    @Test
    public void formatAsBlockFalseTest() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.formatAsBlock());
    }

}