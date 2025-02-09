package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsEmptyValidInputTest {

    @Test
    public void isEmptyValidInputTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

}