package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsKnownTag_StaticKnownTagTest {

    @Test
    public void isKnownTag_StaticKnownTagTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

}