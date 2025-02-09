package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsKnownTagValidTagNameTest {

    @Test
    public void isKnownTagValidTagNameTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

}