package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithTagTest {

    @Test
    public void valueOfWithTagTest() {
        Tag tag = Tag.valueOf("span");
        assertNotNull(tag);
        assertEquals("span", tag.getName());
    }

}