package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEqualsSameObjectInstanceTest {

    @Test
    public void equalsSameObjectInstanceTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = Tag.valueOf("p");
        assertTrue(tag.equals(otherTag));
    }

}