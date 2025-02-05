package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValueOfWithTagToLowerCaseTest {

    @Test
    public void valueOfWithTagToLowerCaseTest() {
        Tag tag = Tag.valueOf("DIV");
        assertEquals("div", tag.getName());
    }

}