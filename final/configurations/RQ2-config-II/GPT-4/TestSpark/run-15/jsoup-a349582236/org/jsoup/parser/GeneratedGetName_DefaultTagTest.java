package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedGetName_DefaultTagTest {

    @Test
    public void getName_DefaultTagTest() {
        Tag tag = Tag.valueOf("tagName");
        assertEquals("tagName", tag.getName());
    }

}