package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyForNonEmptyTagTest {

    @Test
    public void isEmptyForNonEmptyTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isEmpty());
    }

}