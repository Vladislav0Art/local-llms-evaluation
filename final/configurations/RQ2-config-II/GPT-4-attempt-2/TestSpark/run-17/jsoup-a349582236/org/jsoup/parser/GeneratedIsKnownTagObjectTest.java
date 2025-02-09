package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagObjectTest {

    @Test
    public void isKnownTagObjectTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isKnownTag());
    }

}