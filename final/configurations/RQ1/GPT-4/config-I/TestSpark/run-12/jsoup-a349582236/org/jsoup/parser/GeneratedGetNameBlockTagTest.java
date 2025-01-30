package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedGetNameBlockTagTest {

    @Test
    public void getNameBlockTagTest() {
        Tag t = Tag.valueOf("html");
        assertEquals("html", t.getName());
    }

}