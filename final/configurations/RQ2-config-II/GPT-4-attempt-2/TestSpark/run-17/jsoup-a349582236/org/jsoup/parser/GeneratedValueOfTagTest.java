package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedValueOfTagTest {

    @Test
    public void valueOfTagTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

}