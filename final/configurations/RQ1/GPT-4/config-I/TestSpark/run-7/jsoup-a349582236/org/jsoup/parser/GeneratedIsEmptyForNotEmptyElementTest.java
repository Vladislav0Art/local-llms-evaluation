package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyForNotEmptyElementTest {

    @Test
    public void isEmptyForNotEmptyElementTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

}