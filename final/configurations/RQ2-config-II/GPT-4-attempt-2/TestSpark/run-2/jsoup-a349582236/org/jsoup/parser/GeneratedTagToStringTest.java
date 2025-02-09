package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagToStringTest {

    @Test
    public void tagToStringTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("<div>", tag.toString());
    }

}