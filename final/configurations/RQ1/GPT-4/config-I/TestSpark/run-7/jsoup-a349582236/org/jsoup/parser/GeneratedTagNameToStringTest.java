package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagNameToStringTest {

    @Test
    public void tagNameToStringTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.toString());
    }

}