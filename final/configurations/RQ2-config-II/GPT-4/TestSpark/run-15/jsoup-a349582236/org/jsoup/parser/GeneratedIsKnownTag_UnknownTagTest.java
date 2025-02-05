package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsKnownTag_UnknownTagTest {

    @Test
    public void isKnownTag_UnknownTagTest() {
        Tag tag = Tag.valueOf("unknownTag");
        assertFalse(tag.isKnownTag());
    }

}