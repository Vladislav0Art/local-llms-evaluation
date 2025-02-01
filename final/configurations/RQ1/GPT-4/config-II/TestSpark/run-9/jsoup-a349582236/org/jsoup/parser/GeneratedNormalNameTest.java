package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("BODY");
        assertEquals("body", tag.normalName());
    }

}