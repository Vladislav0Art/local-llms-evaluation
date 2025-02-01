package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag t = new Tag("div");
        assertEquals("div", t.getName());
    }

}