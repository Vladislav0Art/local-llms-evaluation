package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        assertEquals("<p></p>", Tag.valueOf("p").toString());
    }

}