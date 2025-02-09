package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagWithNameTest {

    @Test
    public void isKnownTagWithNameTest() {
        assertTrue(Tag.isKnownTag("body"));
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

}