package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Tag emptyTag = Tag.valueOf("img");
        assertTrue(emptyTag.isEmpty());
        Tag nonEmptyTag = Tag.valueOf("p");
        assertFalse(nonEmptyTag.isEmpty());
    }

}