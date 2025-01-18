package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        assertTrue(Tag.valueOf("p").isBlock());
    }

}