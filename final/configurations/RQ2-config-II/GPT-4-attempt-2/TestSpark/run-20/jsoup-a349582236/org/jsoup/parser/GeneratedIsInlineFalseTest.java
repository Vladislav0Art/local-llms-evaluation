package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsInlineFalseTest {

    @Test
    public void isInlineFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isInline());
    }

}