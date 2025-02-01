package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineFalseTest {

    @Test
    public void isInlineFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());
    }

}