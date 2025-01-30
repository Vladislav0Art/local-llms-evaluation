package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagFalseTest {

    @Test
    public void isKnownTagFalseTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

}