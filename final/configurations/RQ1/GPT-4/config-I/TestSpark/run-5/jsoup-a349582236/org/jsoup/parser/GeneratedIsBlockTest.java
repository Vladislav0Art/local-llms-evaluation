package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}