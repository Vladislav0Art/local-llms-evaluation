package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

}