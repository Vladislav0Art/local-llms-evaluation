package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        Tag testTag = Tag.valueOf("div");
        assertTrue(testTag.isKnownTag());
    }

}