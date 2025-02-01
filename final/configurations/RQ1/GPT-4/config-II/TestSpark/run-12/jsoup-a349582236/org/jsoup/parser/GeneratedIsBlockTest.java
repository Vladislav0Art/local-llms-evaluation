package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

}