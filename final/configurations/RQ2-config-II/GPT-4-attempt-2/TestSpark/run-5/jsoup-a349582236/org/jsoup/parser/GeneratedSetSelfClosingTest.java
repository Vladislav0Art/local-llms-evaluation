package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedSetSelfClosingTest {

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("img").setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}