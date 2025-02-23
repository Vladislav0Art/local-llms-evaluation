package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTagTest {

    @Test
    public void isInlineTagTest() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

}