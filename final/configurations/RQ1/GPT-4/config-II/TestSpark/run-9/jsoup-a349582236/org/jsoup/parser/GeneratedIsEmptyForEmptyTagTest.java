package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyForEmptyTagTest {

    @Test
    public void isEmptyForEmptyTagTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

}