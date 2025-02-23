package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTagTest {

    @Test
    public void isBlockTagTest() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

}