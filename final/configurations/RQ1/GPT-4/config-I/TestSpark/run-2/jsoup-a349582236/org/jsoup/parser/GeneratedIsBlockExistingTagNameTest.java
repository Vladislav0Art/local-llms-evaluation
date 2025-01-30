package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockExistingTagNameTest {

    @Test
    public void isBlockExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isBlock());
    }

}