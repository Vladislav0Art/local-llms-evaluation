package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("DIV");
        assertEquals("div", tag.normalName());
    }

}