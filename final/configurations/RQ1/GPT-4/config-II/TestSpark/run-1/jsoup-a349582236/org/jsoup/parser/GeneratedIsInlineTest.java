package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag t = new Tag("span");
        assertFalse(t.isBlock());
    }

}