package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedPreserveWhitespace TestPreserveWhitespace_P {

    @Test
    public void preserveWhitespace

    TestPreserveWhitespace_P() {
        String tagName = "p";
        assertTrue(Tag.isKnownTag(tagName));
        assertTrue(Tag.preserveWhitespace(tagName));
    }

}