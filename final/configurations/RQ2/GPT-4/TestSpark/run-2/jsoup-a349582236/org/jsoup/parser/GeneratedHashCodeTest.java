package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        assertEquals(Tag.valueOf("p").hashCode(), Tag.valueOf("p").hashCode());
    }

}