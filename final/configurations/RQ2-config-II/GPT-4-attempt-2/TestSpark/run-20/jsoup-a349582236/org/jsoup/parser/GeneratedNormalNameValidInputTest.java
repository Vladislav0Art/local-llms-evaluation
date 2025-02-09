package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNormalNameValidInputTest {

    @Test
    public void normalNameValidInputTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.normalName());
    }

}