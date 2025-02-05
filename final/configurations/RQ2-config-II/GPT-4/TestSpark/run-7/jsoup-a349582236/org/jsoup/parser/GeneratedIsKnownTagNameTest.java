package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagNameTest {

    @Test
    public void isKnownTagNameTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

}