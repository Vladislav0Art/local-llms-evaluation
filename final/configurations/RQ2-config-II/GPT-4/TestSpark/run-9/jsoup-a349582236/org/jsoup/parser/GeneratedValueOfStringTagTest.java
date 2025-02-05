package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfStringTagTest {

    @Test
    public void valueOfStringTagTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag instanceof Tag);
    }

}