package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag lowercaseTag = Tag.valueOf("div");
        assertEquals("div", lowercaseTag.normalName());

        Tag uppercaseTag = Tag.valueOf("DIV", ParseSettings.preserveCase);
        assertEquals("div", uppercaseTag.normalName());
    }

}