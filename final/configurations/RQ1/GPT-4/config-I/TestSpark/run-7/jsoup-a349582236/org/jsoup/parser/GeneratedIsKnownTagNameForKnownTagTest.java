package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagNameForKnownTagTest {

    @Test
    public void isKnownTagNameForKnownTagTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

}