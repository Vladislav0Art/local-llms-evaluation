package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

}