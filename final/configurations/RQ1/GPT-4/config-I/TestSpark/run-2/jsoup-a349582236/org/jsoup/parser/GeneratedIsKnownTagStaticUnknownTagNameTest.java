package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagStaticUnknownTagNameTest {

    @Test
    public void isKnownTagStaticUnknownTagNameTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

}