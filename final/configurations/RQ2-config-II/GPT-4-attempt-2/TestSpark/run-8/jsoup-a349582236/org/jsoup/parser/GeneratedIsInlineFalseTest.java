package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedIsInlineFalseTest {

    @Test
    public void isInlineFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());
    }

}