package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagForUnknownTagTest {

    @Test
    public void isKnownTagForUnknownTagTest() {
        Tag tag = Tag.valueOf("unknownTag");
        assertFalse(tag.isKnownTag());
    }

}