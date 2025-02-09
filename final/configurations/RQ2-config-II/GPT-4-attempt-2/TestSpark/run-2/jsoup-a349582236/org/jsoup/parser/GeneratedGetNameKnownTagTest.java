package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameKnownTagTest {

    @Test
    public void getNameKnownTagTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

}