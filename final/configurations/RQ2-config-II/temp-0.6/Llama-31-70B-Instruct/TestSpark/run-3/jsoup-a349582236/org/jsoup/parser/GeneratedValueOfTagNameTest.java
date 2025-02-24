package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfTagNameTest {

    @Test
    public void valueOfTagNameTest() {
        Tag tag = Tag.valueOf("tag1");
        assertEquals("tag1", tag.getName());
    }

}