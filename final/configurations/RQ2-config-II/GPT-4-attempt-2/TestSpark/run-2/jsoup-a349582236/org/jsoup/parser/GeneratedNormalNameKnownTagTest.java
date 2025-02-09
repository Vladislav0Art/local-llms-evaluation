package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameKnownTagTest {

    @Test
    public void normalNameKnownTagTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.normalName());
    }

}