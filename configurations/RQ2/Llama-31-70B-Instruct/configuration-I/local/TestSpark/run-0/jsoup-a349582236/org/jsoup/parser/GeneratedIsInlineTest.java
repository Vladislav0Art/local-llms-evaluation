package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());
    }

}