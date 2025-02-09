package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedIsBlockFalseTest {

    @Test
    public void isBlockFalseTest() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.isBlock());
    }

}