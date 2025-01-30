package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedValueOfUnknownTagTest {

    @Test
    public void valueOfUnknownTagTest() {
        Tag t = Tag.valueOf("unknown");
        assertEquals("unknown", t.getName());
    }

}