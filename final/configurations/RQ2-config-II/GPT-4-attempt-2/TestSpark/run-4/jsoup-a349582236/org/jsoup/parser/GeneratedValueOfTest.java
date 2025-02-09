package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isKnownTag());
    }

}