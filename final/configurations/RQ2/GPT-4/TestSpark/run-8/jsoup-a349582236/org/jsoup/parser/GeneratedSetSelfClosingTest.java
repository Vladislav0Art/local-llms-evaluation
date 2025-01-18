package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedSetSelfClosingTest {

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("span");
        tag = tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}