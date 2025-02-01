package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedIsKnownTagNameTest {

    @Test
    public void isKnownTagNameTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

}