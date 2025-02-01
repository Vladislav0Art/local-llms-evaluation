package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockFalseTest {

    @Test
    public void formatAsBlockFalseTest() {
        Tag tag = Tag.valueOf("q");
        assertFalse(tag.formatAsBlock());
    }

}