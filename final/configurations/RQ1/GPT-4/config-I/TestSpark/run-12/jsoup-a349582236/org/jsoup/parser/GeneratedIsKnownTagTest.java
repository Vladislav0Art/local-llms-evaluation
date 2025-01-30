package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

}