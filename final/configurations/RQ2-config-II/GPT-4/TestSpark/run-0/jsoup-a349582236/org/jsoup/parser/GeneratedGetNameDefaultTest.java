package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetNameDefaultTest {

    @Test
    public void getNameDefaultTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

}