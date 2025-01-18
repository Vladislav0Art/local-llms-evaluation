package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("DIV");
        assertTrue(tag.isBlock());
    }

}