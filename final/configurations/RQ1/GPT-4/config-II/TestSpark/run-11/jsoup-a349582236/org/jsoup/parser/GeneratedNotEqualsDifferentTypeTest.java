package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNotEqualsDifferentTypeTest {

    @Test
    public void notEqualsDifferentTypeTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.equals("div"));
    }

}