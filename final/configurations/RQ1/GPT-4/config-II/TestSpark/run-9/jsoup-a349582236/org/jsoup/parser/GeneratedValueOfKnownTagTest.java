package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfKnownTagTest {

    @Test
    public void valueOfKnownTagTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isKnownTag());
    }

}