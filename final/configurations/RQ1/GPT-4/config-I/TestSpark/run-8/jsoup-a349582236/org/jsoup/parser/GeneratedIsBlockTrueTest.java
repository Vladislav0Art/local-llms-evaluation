package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTrueTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isBlockTrueTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}