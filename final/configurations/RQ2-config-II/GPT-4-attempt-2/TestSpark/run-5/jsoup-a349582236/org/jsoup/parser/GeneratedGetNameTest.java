package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

}