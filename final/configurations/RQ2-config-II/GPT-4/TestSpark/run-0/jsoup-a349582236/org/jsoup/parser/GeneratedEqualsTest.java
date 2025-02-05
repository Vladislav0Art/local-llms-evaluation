package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag = Tag.valueOf("div");
        Tag sameTag = Tag.valueOf("div");
        assertTrue(tag.equals(sameTag));
    }

}