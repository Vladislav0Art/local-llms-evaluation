package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfLowerCaseTest {

    @Test
    public void valueOfLowerCaseTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.getName());
        assertTrue(tag.isKnownTag());
    }

}