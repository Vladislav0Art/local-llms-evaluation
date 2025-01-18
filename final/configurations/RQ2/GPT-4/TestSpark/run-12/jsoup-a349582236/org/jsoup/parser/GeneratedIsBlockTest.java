package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag blockTag = Tag.valueOf("div");
        assertTrue(blockTag.isBlock());
        Tag nonBlockTag = Tag.valueOf("span");
        assertFalse(nonBlockTag.isBlock());
    }

}