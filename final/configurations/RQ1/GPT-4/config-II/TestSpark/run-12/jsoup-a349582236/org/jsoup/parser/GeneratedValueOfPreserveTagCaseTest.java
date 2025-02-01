package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfPreserveTagCaseTest {

    @Test
    public void valueOfPreserveTagCaseTest() {
        Tag tag = Tag.valueOf("P", new ParseSettings(true, true));
        assertEquals("P", tag.getName());
        assertTrue(tag.isKnownTag());
    }

}