package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfUnknownTagTest {

    @Test
    public void valueOfUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        assertEquals("unknown", tag.getName());
        assertFalse(tag.isKnownTag());
    }

}