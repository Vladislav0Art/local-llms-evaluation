package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentTagNameTest {

    @Test
    public void equalsDifferentTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.equals(Tag.valueOf("head")));
    }

}