package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagTrueTest {

    @Test
    public void isKnownTagTrueTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(Tag.isKnownTag(tag.getName()));
    }

}