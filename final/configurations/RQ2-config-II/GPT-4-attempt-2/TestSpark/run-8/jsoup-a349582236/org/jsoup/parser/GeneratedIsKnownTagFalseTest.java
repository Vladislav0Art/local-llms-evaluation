package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedIsKnownTagFalseTest {

    @Test
    public void isKnownTagFalseTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

}