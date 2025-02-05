package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsUnknownTagTest {

    @Test
    public void isUnknownTagTest() {
        Tag tag = Tag.valueOf("faketag");
        assertFalse(tag.isKnownTag());
    }

}