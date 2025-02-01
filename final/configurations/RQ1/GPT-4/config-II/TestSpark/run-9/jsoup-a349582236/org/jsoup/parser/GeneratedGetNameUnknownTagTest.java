package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameUnknownTagTest {

    @Test
    public void getNameUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        assertEquals("unknown", tag.getName());
    }

}