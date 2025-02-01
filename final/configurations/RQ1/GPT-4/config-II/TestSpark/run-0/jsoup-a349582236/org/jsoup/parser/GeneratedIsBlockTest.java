package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isBlock());
    }

}