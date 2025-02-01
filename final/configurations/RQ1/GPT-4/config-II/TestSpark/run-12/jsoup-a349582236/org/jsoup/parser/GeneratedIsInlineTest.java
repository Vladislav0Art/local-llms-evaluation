package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("i");
        assertTrue(tag.isInline());
    }

}