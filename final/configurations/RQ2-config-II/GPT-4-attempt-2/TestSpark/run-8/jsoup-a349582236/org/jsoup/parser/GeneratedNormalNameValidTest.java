package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedNormalNameValidTest {

    @Test
    public void normalNameValidTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.normalName());
    }

}