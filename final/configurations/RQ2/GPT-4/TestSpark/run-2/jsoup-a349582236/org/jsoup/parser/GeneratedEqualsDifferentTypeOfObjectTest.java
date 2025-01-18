package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEqualsDifferentTypeOfObjectTest {

    @Test
    public void equalsDifferentTypeOfObjectTest() {
        assertFalse(Tag.valueOf("p").equals(new String("p")));
    }

}