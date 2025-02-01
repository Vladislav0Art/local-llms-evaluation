package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedValueOfCaseSensitiveTest {

    @Test
    public void valueOfCaseSensitiveTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

}