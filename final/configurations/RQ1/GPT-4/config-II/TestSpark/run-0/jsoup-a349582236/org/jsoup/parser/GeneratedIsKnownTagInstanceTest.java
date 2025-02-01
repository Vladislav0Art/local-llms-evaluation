package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedIsKnownTagInstanceTest {

    @Test
    public void isKnownTagInstanceTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

}