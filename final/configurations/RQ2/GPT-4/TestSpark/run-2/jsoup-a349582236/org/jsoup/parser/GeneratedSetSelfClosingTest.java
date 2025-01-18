package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedSetSelfClosingTest {

    @Test
    public void setSelfClosingTest() {
        assertTrue(Tag.valueOf("p").setSelfClosing().isSelfClosing());
    }

}