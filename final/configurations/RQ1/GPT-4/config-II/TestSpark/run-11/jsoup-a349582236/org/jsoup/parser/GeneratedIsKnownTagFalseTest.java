package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagFalseTest {

    @Test
    public void isKnownTagFalseTest() {
        assertFalse(Tag.isKnownTag("custom"));
    }

}