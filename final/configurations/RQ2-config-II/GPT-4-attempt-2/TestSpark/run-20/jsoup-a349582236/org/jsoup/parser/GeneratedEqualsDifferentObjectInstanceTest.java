package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEqualsDifferentObjectInstanceTest {

    @Test
    public void equalsDifferentObjectInstanceTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = Tag.valueOf("div");
        assertFalse(tag.equals(otherTag));
    }

}